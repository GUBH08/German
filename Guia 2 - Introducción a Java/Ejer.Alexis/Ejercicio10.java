/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alexisrl.practicas;

import java.util.Scanner;

/**
 *
 * @author ALEXIS.R.L
 * Realizar un programa que solo permita introducir solo
 * frases o palabras de 8 de largo. Si el usuario ingresa una frase o palabra de
 * 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
 * en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
 * función Lenght() en Java
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String frase;
        boolean largo=true;
        while (largo) {            
            System.out.println("ingrese una frase");
            frase = teclado.next();
            if (frase.length()==8) {
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecto");
            }
            System.out.println("¿quiere continuar? S = si");
            if (!("s".equalsIgnoreCase(teclado.next()))) {
                largo=false;
            }
        }
        
    }
    
}
