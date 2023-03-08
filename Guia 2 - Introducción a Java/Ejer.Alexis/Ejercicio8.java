/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alexisrl.practicas;

import java.util.Scanner;

/**
 *
 * @author ALEXIS.R.L
 * Crear un programa que dado un numero determine si es par o
 * impar.
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1;
        Scanner teclado = new Scanner(System.in);
        System.err.println("Ingrese un número");
        numero1=teclado.nextInt();
        if (numero1%2==0) {
            System.out.println("Es par");
        
        }else{
            System.out.println("Es impar");
        }
            
        
    }
    
}
