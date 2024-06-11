package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Rol;
import com.mycompany.login.logica.Usuario;
import com.mycompany.login.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public void crearUser(Usuario use) {
        usuarioJpa.create(use);
    }

    public void borrarUser(int id_user) {
        try {
            usuarioJpa.destroy(id_user);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int id_user) {
        return usuarioJpa.findUsuario(id_user);
    }

    public void editarUser(Usuario usu) {
        try {
            usuarioJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
