package temperaturasciudades;

import java.util.Scanner;

public class TemperaturasCiudades {

    public static void main(String[] args) {

        //creamos los 3 vectores
        String ciudades[] = new String[5];
        Double minimas[] = new Double[5];
        Double maximas[] = new Double[5];
        
        //creamos los scanners
        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        
        //cargar los vectores
        for(int i=0; i<ciudades.length; i++){
            
            System.out.println("Ingrese el nombre de la ciudad " + i);
            ciudades[i] = teclado1.next();
            
            System.out.println("Ingrese la mínima de la ciudad " + i);
            minimas[i] = teclado2.nextDouble();
            
            System.out.println("Ingrese la máxima de la ciudad " + i);
            maximas[i] = teclado2.nextDouble();
            
        }
        
        //determinamos la minima
        Double minima = 9999999.00;
        int posMin = -1;
        for(int i=0; i<minimas.length; i++){
            if(minimas[i] < minima){
                minima = minimas[i];
                posMin = i;
            }
        }
        
        //determinamos la maxima
        Double maxima = -9999999.00;
        int posMax = -1;
        for(int i=0; i<maximas.length; i++){
            if(maximas[i] > maxima){
                maxima = maximas[i];
                posMax = i;
            }
        }
        
        System.out.println("La temperatura mínima es de: " + minima + "ºC");
        System.out.println("Se registró en la ciudad: " + ciudades[posMin]);
        System.out.println("------------");
        System.out.println("La temperatura máxima es de: " + maxima + "ºC");
        System.out.println("Se registró en la ciudad: " + ciudades[posMax]);
        
    }
    
}
