/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.ejercicios.Guia4;

import java.util.Scanner;


/**
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir
 * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
 * función para cada operación matemática y deben devolver sus resultados para
 * imprimirlos en el main.
 * @author German
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner leer = new Scanner(System.in);
        boolean b=false;
        System.out.print("Ingrese un numero: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num2 = leer.nextInt();

        System.out.println("======Menu======");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("5.Salir");
        System.out.println("Inrese una opcion");
        int opcion = leer.nextInt();
        do {
            switch (opcion) {
                case 1:
                    int r1 = suma(num1, num2);
                    System.out.println("La suma es: " + r1);
                    break;
                case 2:
                    int r2 = resta(num1, num2);
                    System.out.println("La resta es: " + r2);
                    break;
                case 3:
                    int r3 = multiplicacion(num1, num2);
                    System.out.println("La multiplicacion es: " + r3);
                    break;
                case 4:
                    double r4 = division(num1, num2);
                    System.out.println("La division es: " + r4);
                    break;
                case 5:
                    b=true;
            }
        } while (b == true);
    }

    public static int suma(int num1, int num2) {
        int r = num1 + num2;
        return r;
    }

    public static int resta(int num1, int num2) {
        int r = num1 - num2;
        return r;
    }

    public static int multiplicacion(int num1, int num2) {
        int r = num1 * num2;
        return r;
    }

    public static double division(double num1, double num2) {
        double r = num1 / num2;
        return r;
    }
    
}
