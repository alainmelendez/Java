package Videojuegos;

import logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;

public class EjercicioVideojuego {

    public static void main(String[] args) {

        //Crear el Arraylist listaVideojuegos
        List<VideoJuego> listaVideojuegos = new ArrayList<VideoJuego>();

        // Crear 5 Videojuegos
        VideoJuego video1 = new VideoJuego(123, "Banjo Kazooie", "Nintendo 64",
                                        4, "Plataforma");
        VideoJuego video2 = new VideoJuego(456, "Mario Party 3", "Nintendo 64",
                                        4, "Plataforma");
        VideoJuego video3 = new VideoJuego(789, "Age og Empire II", "PC",
                                        1, "Estrategia");
        VideoJuego video4 = new VideoJuego(101, "Counter Strike 1.6", "PC",
                                        1, "Shooter");
        VideoJuego video5 = new VideoJuego(100, "Mario Kart 64", "Nintendo 64",
                                        2, "Plataforma");

        // Guardar los videosjuegos creados en el Arraylist
        listaVideojuegos.add(video1);
        listaVideojuegos.add(video2);
        listaVideojuegos.add(video3);
        listaVideojuegos.add(video4);
        listaVideojuegos.add(video5);

        // Recorrer el Arraylist y mostrar en pantalla titulo, consola, y CantJugadores
        for (VideoJuego video: listaVideojuegos){
            System.out.println("Titulo: " + video.getTitulo() +
                    " Consola: " + video.getConsola() +
                    " Cant Jugadores: " + video.getCantJugadores());
        }

        // Cambiar el nombre y Cantjugadores de 2 videojuegos.
        video1.setTitulo("Banjo Kazooie II");
        video1.setCantJugadores(1);

        video5.setTitulo("Super Mario Kart 64");
        video5.setCantJugadores(4);
        System.out.println("-----------------");
        for (VideoJuego video: listaVideojuegos){
            System.out.println("Titulo: " + video.getTitulo() +
                    " Consola: " + video.getConsola() +
                    " Cant Jugadores: " + video.getCantJugadores());
        }

        //Recorrer el Arraylist y mostrar solo los que sean de consola Nintendo 64
        System.out.println("-----------------");
        for (VideoJuego video: listaVideojuegos){
            if (video.getConsola().equals("Nintendo 64")){
                System.out.println(video.toString());

            }
        }

    }
}