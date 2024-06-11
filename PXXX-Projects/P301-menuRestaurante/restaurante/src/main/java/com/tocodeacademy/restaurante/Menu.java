package com.tocodeacademy.restaurante;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Menu {
    
    private int numPlato;
    private String nombre;
    private double precio;
    private String descripcion;   

    public Menu() {
    }

    public Menu(int numPlato, String nombre, double precio, String descripcion) {
        this.numPlato = numPlato;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    
    
}
