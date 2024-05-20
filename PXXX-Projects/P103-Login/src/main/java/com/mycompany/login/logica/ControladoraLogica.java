package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = null;

    public ControladoraLogica() {
        controlPersis = new ControladoraPersistencia();
    }

    public Usuario validarUser(String usuario, String password) {
        Usuario userFound = null;
        List<Usuario> listaUsers = controlPersis.traerUsuarios();
        
        for (Usuario user : listaUsers){
            if (user.getNombreUser().equals(usuario)){
                if(user.getPassword().equals(password)){
                    userFound = user;
                    return userFound;
                }
                else {
                    userFound=null;
                    return userFound;
                }   
            }
            else {
                userFound=null;
            }
        }
        return userFound;
    }

    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }

    public List<Rol> traerRoles() {
        return controlPersis.traerRoles();
    }

    
}
