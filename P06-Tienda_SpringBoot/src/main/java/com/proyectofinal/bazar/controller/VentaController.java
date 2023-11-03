package com.proyectofinal.bazar.controller;

import com.proyectofinal.bazar.dto.MayorVentaDTO;
import com.proyectofinal.bazar.model.Producto;
import com.proyectofinal.bazar.model.Venta;
import com.proyectofinal.bazar.service.IVentaService;
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
public class VentaController {
    
    @Autowired
    private IVentaService ventaServ;
    
    //2. CRUD/ABML de ventas
    @GetMapping("/ventas")
    public List<Venta> getVentas(){
        return ventaServ.getVentas();
    }
    
    @GetMapping("/ventas/{codigo_venta}")
    public Venta findVenta(@PathVariable Long codigo_venta){
        return ventaServ.findVenta(codigo_venta);
    }
    
    @PostMapping("/ventas/crear")
    public String saveVenta(@RequestBody Venta venta){
        ventaServ.saveVenta(venta);
        return "La venta fue creada correctamente";
    }
    
    @DeleteMapping("/ventas/eliminar/{codigo_venta}")
    public String deleteVenta(@PathVariable Long codigo_venta){
        ventaServ.deleteVenta(codigo_venta);
        return "La venta fue eliminada correctamente";
    }
    
    @PutMapping("/ventas/editar/{codigo_venta}")
    public Venta editVenta(@RequestBody Venta venta){
        ventaServ.editVenta(venta);
        return ventaServ.findVenta(venta.getCodigo_venta());
    }
    
    //5. Obtener todos los productos de una determinada ventas
    @GetMapping ("/ventas/productos/{codigo_venta}")
    public List<Producto> productosPorVenta (@PathVariable Long codigo_venta) {
        return ventaServ.productosPorVenta(codigo_venta);
    }
    
    //6. Obtener sumatoria del monto y total de ventas de una fecha concreta
    @GetMapping ("/ventas/fechaventa/{fecha}")
    public String montoyTotal (@PathVariable String fecha) {
        return ventaServ.montoyTotal(fecha);
    }
    
    //7. Obtener el codigo_venta, el total, la cantidad de productos, el nombre del cliente y el 
    //apellido del cliente de la venta con el monto más alto de todas.
    @GetMapping ("/ventas/mayor_venta")
    public MayorVentaDTO mayorVenta () {
        return ventaServ.mayorVenta();
    }
    
}