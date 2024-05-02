package arbolitonavidad;

public class ArbolitoNavidad {

    public static void main(String[] args) {
        //   *
        //  ***
        // *****
        //*******
        //  |||
        
        //altura del arbol
        int altura = 10;
        //largo del tronco
        int largoTronco = 3;
        
        //buble para recorrer todas las filas (altura)
        for (int fila=0; fila<altura; fila++){
            
            //buble para los espacios
            for (int espacio=0;espacio<(altura-fila-1);espacio++){
                System.out.print(" ");
            }
            
            //buble para los asteriscos
            for (int asterisco=0;asterisco<(fila*2)+1;asterisco++){
                System.out.print("*");
            }
            
            //si no agrego el salto de linea no separa las filas del arbolito
            System.out.println("");
        }
        
        //bucle para añadir tronco
        for (int base=0; base<largoTronco; base++){
            
            //espacios en blanco
            for (int espacio=0;espacio<(altura-2);espacio++){
                System.out.print(" ");
            }
            
            //barritas tronco
            for (int tronco=0;tronco<3;tronco++){
                System.out.print("|");
            }
            
            //si no agrego el salto de linea no separa las filas del arbolito
            System.out.println("");
            
        }
        
    }
    
}
