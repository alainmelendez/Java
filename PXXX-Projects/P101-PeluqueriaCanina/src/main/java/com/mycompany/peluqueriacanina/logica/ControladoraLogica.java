package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, 
            String observaciones, String alergico, String atenEspec, 
            String nombreDuenio, String celDuenio) {
        
        //Creamos al dueño y asignamos sus valores
        //el Id del duenio sera automatico por la base de datos
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        //Creamos la mascota y asignamos sus valores
        //el num_cliente sera automatico por la base de datos
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEspec);
        masco.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio,masco);
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascotas(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, 
            String color, String observaciones, String alergico, String atenEspec, 
            String nombreDuenio, String celDuenio) {
        //seteamos los valores independientemente de que se modifico o no
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEspec);
        
        //modifico mascota
        controlPersis.modificarMascota(masco);
        
        //identifiquemos al dueño
        //puede ser con este método 
        //Duenio duenio = controlPersis.buscarDuenio()
        //pero mejor usaremos esto
        Duenio duenio = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
        
        //seteamos valores de duenio
        duenio.setCelDuenio(celDuenio);
        duenio.setNombre(nombreDuenio);
        
        //modifico duenio
        this.modificarDuenio(duenio);
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio duenio) {
        controlPersis.modificarDuenio(duenio);
    }
    
}
