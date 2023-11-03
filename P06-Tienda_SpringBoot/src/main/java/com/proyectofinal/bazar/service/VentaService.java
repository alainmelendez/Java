package com.proyectofinal.bazar.service;

import com.proyectofinal.bazar.dto.MayorVentaDTO;
import com.proyectofinal.bazar.model.Cliente;
import com.proyectofinal.bazar.model.Producto;
import com.proyectofinal.bazar.model.Venta;
import com.proyectofinal.bazar.repository.IVentaRepository;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService implements IVentaService{
    
    @Autowired
    private IVentaRepository ventaRepo;

    @Override
    public List<Venta> getVentas() {
        List <Venta> listaVentas = ventaRepo.findAll();
        return listaVentas;
    }

    @Override
    public void saveVenta(Venta venta) {
        ventaRepo.save(venta);
    }

    @Override
    public void deleteVenta(Long codigo_venta) {
        ventaRepo.deleteById(codigo_venta);
    }

    @Override
    public Venta findVenta(Long codigo_venta) {
        Venta venta = ventaRepo.findById(codigo_venta).orElse(null);
        return venta;
    }

    @Override
    public void editVenta(Venta venta) {
        this.saveVenta(venta);
    }
    
    @Override
    public List<Producto> productosPorVenta(Long codigo_venta) {  
        Venta venta = this.findVenta(codigo_venta);
        List<Producto> listaProductos = venta.getListaProductos();
        return listaProductos;
    }
    
    @Override
    public String montoyTotal(String fecha){
        List<Venta> listaVentas = this.getVentas();
        Double montoTotal = 0.0;
        int totalVentas = 0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (Venta venta : listaVentas) {
            String fechaVenta = venta.getFecha_venta().format(formatter);
            if (fechaVenta.equals(fecha)){
                montoTotal += venta.getTotal();
                totalVentas += 1;
            }
        }
        return "Para el día " + fecha + ", la sumatoria del monto es ARS " + montoTotal + 
                ". La cantidad total de ventas: " + totalVentas;
    }
    
    @Override
    public MayorVentaDTO mayorVenta(){
        MayorVentaDTO maxVentaDTO = new MayorVentaDTO();
        List<Venta> listaVentas = this.getVentas();
        Venta ventaMaxima = new Venta();
        ventaMaxima.setTotal(0.0);
        for (Venta venta : listaVentas) {
            if (venta.getTotal() > ventaMaxima.getTotal()) {
                ventaMaxima = venta; // Actualizamos la venta con el valor máximo
            }
        }
        Cliente cliente = ventaMaxima.getCliente();
        List<Producto> listaProductos = ventaMaxima.getListaProductos();
        maxVentaDTO.setCodigo_venta(ventaMaxima.getCodigo_venta());
        maxVentaDTO.setTotal(ventaMaxima.getTotal());
        maxVentaDTO.setCantidad_productos(listaProductos.size());
        maxVentaDTO.setNombre_cliente(cliente.getNombre_cliente());
        maxVentaDTO.setApellido_cliente(cliente.getApellido_cliente());
        return maxVentaDTO;
    }
   
}