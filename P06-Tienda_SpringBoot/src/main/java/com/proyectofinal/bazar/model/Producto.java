package com.proyectofinal.bazar.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter @Setter
@Entity
public class Producto {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long codigo_producto;
    private String nombre_producto;
    private String marca_producto;
    private Double costo;
    private Double cantidad_disponible;
    
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="codigo_venta")
    private Venta venta;

    public Producto() {
    }

    public Producto(Long codigo_producto, String nombre_producto, String marca_producto, Double costo, Double cantidad_disponible, Venta venta) {
        this.codigo_producto = codigo_producto;
        this.nombre_producto = nombre_producto;
        this.marca_producto = marca_producto;
        this.costo = costo;
        this.cantidad_disponible = cantidad_disponible;
        this.venta = venta;
    }


    

    
    
    
}
