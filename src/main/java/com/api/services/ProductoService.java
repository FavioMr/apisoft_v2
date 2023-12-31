package com.api.services;

import com.api.model.Entrada;
import com.api.model.EntradaImportado;
import com.api.model.Producto;
import com.api.model.Response;
import com.api.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    @Autowired
    private EntradaService entradaService;

    public Response createProducto(Producto producto) {
        try {
            productoRepository.save(producto);
            return new Response(true, "Correcto");
        }catch (Exception e){
            return new Response(false,"Error al crear producto");
        }
    }

    public List<Producto> getProductos() {
        return productoRepository.findAll(Sort.by(Sort.Direction.ASC,"codigo"));
    }

    public Response editarProducto(Producto producto) {
        return productoRepository.save(producto) != null ? new Response(true, "Editado de manera correcta: " + producto.toString()) : new Response(false, "Error al editar: " + producto.toString());
    }

    public Producto getOneProductoId(String id) {
        return productoRepository.getById(id);
    }

    public Producto getOneProductoCOdigo(String codigo){
        return productoRepository.findBycodigo(codigo);
    }

    public Response removeProducto(String id) {
        Producto p = getOneProductoId(id);
        Response response = p != null ? new Response(true, "Producto eliminado: " + p.toString()) : new Response(false, "Producto no existe: " + p.toString());
        if (response.isStatus()) {
            productoRepository.delete(p);
            return response;
        }
        return response;
    }

    public Response sendDataExcel(EntradaImportado entradaImp){
        try{
            boolean n;
            for ( Producto p : entradaImp.getListaProd()) {
               createProducto(p);
               entradaService.crearEntrada(new Entrada("","Importado",entradaImp.getUsuarioActual(),entradaImp.getHora(), entradaImp.getFechaMod(), p.getCodigo(),p.getNombre(),p.getCantidadmin(), p.getCantidadact(), p.getAlmacen(),p.getPreciounitario(),p.getFechaingreso()));
            }
            return new Response(true, "Cargado completado");
        }catch (Exception e){
            return new Response(false, "Error al cargar datos");
        }
    }
}
