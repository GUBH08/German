/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.ejercicios.Guia4;

import java.util.Scanner;

/**
 * Crea una aplicación que nos pida un número por teclado y con una función se
 * lo pasamos por parámetro para que nos indique si es o no un número primo,
 * debe devolver true si es primo, sino false. Un número primo es aquel que solo
 * puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es
 * divisible entre 5, sin embargo, 17 si es primo.
 *
 * @author German
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      numeroprimo();
    }
    public static void numeroprimo(){
        Scanner leer = new Scanner(System.in);
        int cont=0;
        System.out.print("Ingrese un numero: ");
        int num = leer.nextInt();
        
        for (int i = 1; i <= num ; i++) {
            if (num%i==0){
                cont++;
            }
        }
        if (cont == 2) {
            System.out.println("Es Primo");
        }else{
            System.out.println("No es primo");
        }
    }
}
