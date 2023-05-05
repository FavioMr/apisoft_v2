package com.api.services;

import com.api.model.Producto;
import com.api.model.Response;
import com.api.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Producto createProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public List<Producto> getProductos() {
        return productoRepository.findAll();
    }

    public Response editarProducto(Producto producto) {
        return productoRepository.save(producto) != null ? new Response(true, "Editado de manera correcta: " + producto.toString()) : new Response(false, "Error al editar: " + producto.toString());
    }

    public Producto getOneProductoId(String id) {
        return productoRepository.getById(id);
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
}
