package com.proyectofinal.bazar.controller;

import com.proyectofinal.bazar.model.Producto;
import com.proyectofinal.bazar.service.IProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {
    
    @Autowired
    private IProductoService productoServ;
    
    //2. CRUD/ABML de productos
    @GetMapping("/productos")
    public List<Producto> getProductos(){
        return productoServ.getProductos();
    }
    
    @GetMapping("/productos/{codigo_producto}")
    public Producto findProducto(@PathVariable Long codigo_producto){
        return productoServ.findProducto(codigo_producto);
    }
    
    @PostMapping("/productos/crear")
    public String saveProducto(@RequestBody Producto producto){
        productoServ.saveProducto(producto);
        return "El producto fue creado correctamente";
    }
    
    @DeleteMapping("/productos/eliminar/{codigo_producto}")
    public String deleteProducto(@PathVariable Long codigo_producto){
        productoServ.deleteProducto(codigo_producto);
        return "El producto fue eliminado correctamente";
    }
    
    @PutMapping("/productos/editar/{codigo_producto}")
    public Producto editProducto(@RequestBody Producto producto){
        productoServ.editProducto(producto);
        return productoServ.findProducto(producto.getCodigo_producto());
    }
    
    //4. Obtener los productos que sean menores a 5
    @GetMapping("/productos/falta_stock")
    public List<Producto> getMenorCinco(){
        return productoServ.getMenorCinco();
    }
    
}