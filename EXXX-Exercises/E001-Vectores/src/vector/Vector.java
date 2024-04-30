
package vector;

import java.util.Scanner;


public class Vector {

    
    public static void main(String[] args) {
       int vector [] = new int [15];
       Scanner teclado = new Scanner (System.in);
       
       //cargar nuestro vector
       for (int i = 0; i < 15; i++) {
           System.out.println("Ingrese un número para el vector");
           vector[i] = teclado.nextInt();
       }
       
       //recorrer y contar cuántos números 3 hay
       int cont = 0;
       
       for (int i = 0; i < 15; i++) {
           if(vector[i]==3) {
               cont = cont + 1;
           }
       }
       
        System.out.println("La cantidad de números 3 que hay en el vector es: " + cont);
    }
    
}
