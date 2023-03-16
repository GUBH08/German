/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alexisrl.practicas;

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
 * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la
 * función equals() de la clase String.
 *
 * @author ALEXIS.R.L
 */
public class Ejercicio3Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese una letra");
        String caracter = leer.nextLine();
        caracter = caracter.toUpperCase();
        if (caracter.equals("A") || caracter.equals("E") || caracter.equals("I") || caracter.equals("O") || caracter.equals("U")) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");

        }

    }

}
