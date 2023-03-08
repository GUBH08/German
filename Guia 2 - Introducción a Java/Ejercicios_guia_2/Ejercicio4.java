/*
 *Dada una cantidad de grados centígrados se debe mostrar su
  equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
  + (9 * C / 5).
 
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author German
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        double n1;
        
        System.out.println("Escribe los grados centigrados: ");
        n1 = leer.nextInt();
      
        System.out.println("Grados fahrenheit: " + (32 + (9*n1/5)) + " °F");
    }
            
}
