package com.proyectofinal.bazar.service;

import com.proyectofinal.bazar.model.Producto;
import com.proyectofinal.bazar.model.Venta;
import com.proyectofinal.bazar.repository.IProductoRepository;
import com.proyectofinal.bazar.repository.IVentaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService{
    
    @Autowired
    private IProductoRepository productoRepo;

    @Autowired
    private IVentaRepository ventaRepo;
    
    @Autowired
    private IVentaService ventaServ;
    @Override
    public List<Producto> getProductos() {
        List <Producto> listaProductos = productoRepo.findAll();
        return listaProductos;
    }

    @Override
    public void saveProducto(Producto producto) {
        Double totalCosto = 0.0;
        Venta venta = ventaServ.findVenta(producto.getVenta().getCodigo_venta());
        if (venta.getTotal() != null){
            totalCosto += (producto.getCosto() + venta.getTotal());
        }
        else{
            totalCosto += producto.getCosto();
        }

        // Actualizar el campo total de la venta con el total calculado
        venta.setTotal(totalCosto);
        
        // Guardar la venta actualizada en la base de datos
        ventaRepo.save(venta);
        
        productoRepo.save(producto);
    }

    @Override
    public void deleteProducto(Long codigo_producto) {
        productoRepo.deleteById(codigo_producto);
    }

    @Override
    public Producto findProducto(Long codigo_producto) {
        Producto producto = productoRepo.findById(codigo_producto).orElse(null);
        return producto;
    }

    @Override
    public void editProducto(Producto producto) {
        this.saveProducto(producto);
    }
    
    public List<Producto> getMenorCinco() {
        // Obtener la lista de productos
        List<Producto> listaProductos = getProductos();

        // Crear una nueva lista para almacenar los productos filtrados
        List<Producto> productosFiltrados = new ArrayList<>();

        // Filtrar los productos con cantidad_disponible < 5
        for (Producto producto : listaProductos) {
            if (producto.getCantidad_disponible() < 5) {
                productosFiltrados.add(producto);
            }
        }
        return productosFiltrados;
    }
   
}