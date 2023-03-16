/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alexisrl.practicas;

import java.util.Scanner;

/**
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo
 * y el promedio de n números (n>0). El valor de n se solicitará al principio
 * del programa y los números serán introducidos por el usuario. Realice dos
 * versiones del programa, una usando el bucle “while” y otra con el bucle “do -
 * while”.
 *
 * @author ALEXIS.R.L
 */
public class Ejercicio7Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float promedio;
        int numero, valMax = 0, valMin = 999999, acumulador = 0, contador = 0;
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese un numero positivo");
            numero = teclado.nextInt();
            if (numero <= 0) {
                continuar = false;
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

        }
        promedio=(acumulador/contador);
        System.out.println("el promedio es: "+promedio);
        System.out.println("el valor maximo es: "+valMax);
        System.out.println("el valor minimo es: "+valMin);
        teclado.close();
    }

}
