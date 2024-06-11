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

    public void crearUser(String usuario, String password, String rolInput) {
        Usuario use = new Usuario();
        use.setNombreUser(usuario);
        use.setPassword(password);
        
        Rol rolBuscado = new Rol();
        rolBuscado = this.traerRol(rolInput);
        if (rolBuscado!=null){
            use.setUnRol(rolBuscado);
        }
        
        int id = this.buscarUltimaIdUsers();
        use.setId(id+1);
        controlPersis.crearUser(use);
        
    }

    private Rol traerRol(String rolInput) {
        List<Rol> listaRoles = this.traerRoles();
        for (Rol rol:listaRoles){
            if (rol.getNombreRol().equals(rolInput)){
                return rol;
            }
        }
        return null;
    }

    private int buscarUltimaIdUsers() {
        List<Usuario> listaUsuarios = this.traerUsuarios();
        Usuario use = listaUsuarios.get(listaUsuarios.size()-1);
        return use.getId();
        
    }

    public void borrarUser(int id_user) {
        controlPersis.borrarUser(id_user);
    }

    public Usuario traerUsuario(int id_user) {
        return controlPersis.traerUsuario(id_user);
    }

    public void editarUser(Usuario usu, String usuario, String password, String rolInput) {
        usu.setNombreUser(usuario);
        usu.setPassword(password);
        
        Rol rolBuscado = new Rol();
        rolBuscado = this.traerRol(rolInput);
        if (rolBuscado!=null){
            usu.setUnRol(rolBuscado);
        }
        System.out.println(usuario);
        System.out.println(password);
        System.out.println(usu.getUnRol().getNombreRol());
        controlPersis.editarUser(usu);
    }

    
}
