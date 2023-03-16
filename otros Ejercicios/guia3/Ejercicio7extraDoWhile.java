/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alexisrl.practicas;

import java.util.Scanner;

/**
 *
 * @author ALEXIS.R.L
 */
public class Ejercicio7extraDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float promedio;
        int numero, valMax = 0, valMin = 999999, acumulador = 0, contador = 0;
        Scanner teclado = new Scanner(System.in);
        boolean continuar = false;
        do {
            System.out.println("Ingrese un numero positivo");
            numero = teclado.nextInt();
            if (numero <= 0) {
                continuar = true;
            } else {
                acumulador = acumulador + numero;
                contador++;
                if (numero > valMax) {
                    valMax = numero;
                }
                if (numero < valMin) {
                    valMin = numero;
                }
            }

        } while (!continuar);

        promedio = (acumulador / contador);
        System.out.println("el promedio es: " + promedio);
        System.out.println("el valor maximo es: " + valMax);
        System.out.println("el valor minimo es: " + valMin);
        teclado.close();
    }
}
