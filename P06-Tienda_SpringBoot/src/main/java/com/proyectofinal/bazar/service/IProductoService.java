package com.proyectofinal.bazar.service;

import com.proyectofinal.bazar.model.Producto;
import java.util.List;

public interface IProductoService {
    
    //método para traer a todos los Productos
    public List<Producto> getProductos();
    
    //alta
    public void saveProducto(Producto producto);
    
    //baja
    public void deleteProducto(Long codigo_producto);
    
    //lectura de un solo objeto
    public Producto findProducto(Long codigo_producto);

    //editar
    public void editProducto(Producto producto);
    
    //Falta stock (ver cantidad disponible)
    public List<Producto> getMenorCinco();
    
}
