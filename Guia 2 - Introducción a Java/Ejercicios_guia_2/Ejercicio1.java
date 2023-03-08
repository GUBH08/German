/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author German
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1,num2;
        System.out.println("Ingrese un numero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = leer.nextInt();
        
        System.out.println("El resultado de la suma es: " + (num1+num2));
        
    }
    
}
