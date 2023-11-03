package com.proyectofinal.bazar.service;

import com.proyectofinal.bazar.dto.MayorVentaDTO;
import com.proyectofinal.bazar.model.Producto;
import com.proyectofinal.bazar.model.Venta;
import java.util.List;

public interface IVentaService {
    
    //método para traer a todos los Ventas
    public List<Venta> getVentas();
    
    //alta
    public void saveVenta(Venta venta);
    
    //baja
    public void deleteVenta(Long codigo_venta);
    
    //lectura de un solo objeto
    public Venta findVenta(Long codigo_venta);

    //editar
    public void editVenta(Venta venta);
    
    //5. Obtener todos los productos de una determinada venta
    public List<Producto> productosPorVenta(Long codigo_venta);
    
    //6. Obtener sumatoria del monto y total de ventas de una fecha concreta
    public String montoyTotal(String fecha);
    
    //7. Obtener el codigo_venta, el total, la cantidad de productos, el nombre del cliente y el 
    //apellido del cliente de la venta con el monto más alto de todas.
    public MayorVentaDTO mayorVenta();
    
}
