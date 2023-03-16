/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.ejercicios.Guia4;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a convertir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void).
 * El cambio de divisas es: i.   * 0.86 libras es un 1 €
 *                          ii.  * 1.28611 $ es un 1 € 
 *                          iii. * 129.852 yenes es un 1 €
 * 
 * 
 * @author German
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        convertidor();
        
    }
    public static void convertidor (){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el monto a convertir");
        double euro = leer.nextDouble();
        System.out.println("Elija a que moneda quiere convertir");
        System.out.println("1.Libra");
        System.out.println("2.Dolar");
        System.out.println("3.Yenes");
        int opcion = leer.nextInt();
        switch(opcion){
            case 1:
                double libra = euro * 0.86;
                System.out.println("El euro a libra es: " + libra );
                break;
            case 2:
                double dolar = euro * 1.28611;
                System.out.println("El euro a dolar es: " + dolar );
                break;
            case 3:
                double yenes = euro * 129.852;
                System.out.println("El euro a yenes es: " + yenes );
                break;
        }
    }
}
