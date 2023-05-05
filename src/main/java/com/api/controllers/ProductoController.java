package com.api.controllers;

import com.api.model.Producto;
import com.api.model.Response;
import com.api.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/productos/")
    public Producto enviarProducto(@RequestBody Producto producto) {
        return productoService.createProducto(producto);
    }

    @GetMapping("/productos/")
    public List<Producto> obtenerProducto() {
        return productoService.getProductos();
    }

    @PostMapping("/productos/{id}")
    public Response editarProducto(@PathVariable String id, @ModelAttribute("producto") Producto producto) {
        Producto producto1 = productoService.getOneProductoId(id);
        producto1.setId(id);
        producto1.setCodigo(producto.getCodigo());
        producto1.setAlmacen(producto.getAlmacen());
        producto1.setCantidadact(producto.getCantidadact());
        producto1.setCantidadmin(producto.getCantidadmin());
        producto1.setFechaingreso(producto.getFechaingreso());
        producto1.setNombre(producto.getNombre());
        producto1.setPreciounitario(producto.getPreciounitario());
        return productoService.editarProducto(producto1);
    }
}
