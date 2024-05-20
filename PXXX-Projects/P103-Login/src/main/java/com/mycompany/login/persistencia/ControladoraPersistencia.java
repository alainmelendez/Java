package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Rol;
import com.mycompany.login.logica.Usuario;
import java.util.List;

public class ControladoraPersistencia {

    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();

    public List<Usuario> traerUsuarios() {
        //similar a SELECT * FROM usuarios;
        return usuarioJpa.findUsuarioEntities();
    }

    public List<Rol> traerRoles() {
        //similar a SELECT * FROM roles;
        return rolJpa.findRolEntities();
    }
    
    
    
}
