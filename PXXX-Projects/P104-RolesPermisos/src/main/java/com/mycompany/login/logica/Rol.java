package com.mycompany.login.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rol implements Serializable {
    
    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private int idRol;
    private String nombreRol;
    private String descripcion;
    @OneToMany (mappedBy = "unRol")
    private List<Usuario> listaUsers;

    public Rol() {
    }

    public Rol(int idRol, String nombreRol, String descripcion, List<Usuario> listaUsers) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.descripcion = descripcion;
        this.listaUsers = listaUsers;
    }

    public int getId() {
        return idRol;
    }

    public void setId(int id) {
        this.idRol = id;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Usuario> getListaUsers() {
        return listaUsers;
    }

    public void setListaUsers(List<Usuario> listaUsers) {
        this.listaUsers = listaUsers;
    }
    
    
    
}
