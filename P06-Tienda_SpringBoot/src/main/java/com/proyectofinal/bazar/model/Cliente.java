package com.proyectofinal.bazar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Cliente {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_cliente;
    private String nombre_cliente;
    private String apellido_cliente;
    private String dni;

    public Cliente() {
    }

    public Cliente(Long id_cliente, String nombre_cliente, String apellido_cliente, String dni) {
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.dni = dni;
    }

    
    
    
}
