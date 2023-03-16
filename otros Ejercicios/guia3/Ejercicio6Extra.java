/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alexisrl.practicas;

import java.util.Scanner;

/**
 * Leer la altura de N personas y determinar el promedio de estaturas que se
 * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 *
 * @author ALEXIS.R.L
 */
public class Ejercicio6Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float altura, total = 0, totalMin = 0, promedio, promedioMin;
        int cantidad, cantidadMin = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        cantidad = teclado.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("ingrese su altura");
            altura = teclado.nextFloat();
            total += altura;
            if (altura < 1.60) {
                totalMin += altura;
                cantidadMin++;
            }

        }
        promedio = total / cantidad;
        promedioMin = totalMin / cantidadMin;
        
        System.out.println("el promedio general es: " + promedio);
        
        System.out.println("el promedio de la gente menor a 1,60 es: " + promedioMin);
    }   

}
