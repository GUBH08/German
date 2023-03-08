/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alexisrl.practicas;

import java.util.Scanner;

/**
 *
 * @author ALEXIS.R.L
 * Crear un programa que pida una frase y si esa frase es
 * igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un
 * mensaje de Incorrecto. Nota: investigar la función equals() en Java.
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String frase;
        System.out.println("ingrese una frase");
        frase=teclado.next();
        if ("eureka".equalsIgnoreCase(frase)) {
            System.out.println("Es correcto");
        } else {
            System.out.println("Es Incorrecto");
        }
    }
    
}
