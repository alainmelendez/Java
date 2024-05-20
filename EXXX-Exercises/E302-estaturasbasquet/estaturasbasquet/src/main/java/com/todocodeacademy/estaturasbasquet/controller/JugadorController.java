package com.todocodeacademy.estaturasbasquet.controller;

import com.todocodeacademy.estaturasbasquet.model.Jugador;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JugadorController {
    
    @PostMapping("/jugadores")
    public String promedioEstaturas(@RequestBody List <Jugador> listaJugadores){
        
        double promedioEstatura = 0.0;
        
        //Almacenamos la lista de jugadores en nuestra base de datos
        List <Jugador> listaJuga = new ArrayList<Jugador>();
        listaJuga = listaJugadores;
        
        //Se calcula el promedio de la estatura de jugadores
        for (Jugador jug: listaJuga){
            promedioEstatura += jug.getEstatura();
        }
        promedioEstatura /= listaJuga.size();
        
        return "Jugadores registrados correctamente. El promedio de estatura de los jugadores es: " + promedioEstatura;
    }
}
 