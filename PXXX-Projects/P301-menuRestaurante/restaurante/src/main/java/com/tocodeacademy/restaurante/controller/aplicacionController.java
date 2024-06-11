package com.tocodeacademy.restaurante.controller;

import com.tocodeacademy.restaurante.Menu;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aplicacionController {
    
    @GetMapping("/menu/{numPlato}")
    @ResponseBody
    public Menu devolverPlato(@PathVariable int numPlato){
        
        //Creamos ArrayList listaPlatos
        List<Menu> listaPlatos = new ArrayList<Menu>();
        
        //Creamos 5 platos para el menu
        Menu plato1 = new Menu(1, "Pabellon", 75.3, 
                "Plato venezolano que incluye: arroz, carne mechada, tajadas, caraotas negras");
        Menu plato2 = new Menu(2, "Pizza", 76.3, 
                "Masa redonda que se adorna con: queso, jamon, aceitunas, salsa roja y salame");
        Menu plato3 = new Menu(3, "Nuggets", 77.3, 
                "Plato rápido de nuggets con puré de papas y ensalada de tomates con pepino");
        Menu plato4 = new Menu(4, "Pastel de Vegetales", 78.3, 
                "La mejor comida de mama, no tiene descripción");
        Menu plato5 = new Menu(5, "Sopa", 79.3, 
                "Plato casero que incluye: papas, zanahorias, auyama, pollito. Todo esto trozadito y bien aliñadito");
        
        //Se añaden los platos a la lista
        listaPlatos.add(plato1);
        listaPlatos.add(plato2);
        listaPlatos.add(plato3);
        listaPlatos.add(plato4);
        listaPlatos.add(plato5);
        
        for (Menu plato: listaPlatos){
            if (plato.getNumPlato() == numPlato){
                return plato;
            }
        }
        
        //si no encuentra nada que devuelva otra cosa
        return null;
    }
    
}
