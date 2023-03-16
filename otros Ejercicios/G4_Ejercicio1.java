/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Subprogramas;

import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;


/**
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir
 * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
 * función para cada operación matemática y deben devolver sus resultados para
 * imprimirlos en el main.
 *
 * @author ALEXIS.R.L
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,resultado,menu;
        System.out.println("ingrese los numeros ");
        Scanner leer = new Scanner(System.in);
        num1=leer.nextInt();
        num2=leer.nextInt();
           do {     
               System.out.println("   MENU   \n 1: suma \n 2: resta \n 3: multiplicacion \n 4: division \n 5: salir");
               menu=leer.nextInt();
               switch (menu) {
                   case 1:
                       System.out.println(suma(num1,num2));
                       break;
                   case 2:
                       System.out.println(resta(num1,num2));
                       break;
                   case 3:
                       System.out.println(multiplica(num1,num2));
                       break;
                   case 4:
                       System.out.println(dividir(num1,num2));
                       break;
                   
               }
  
        } while (menu<=4);
     
        
    }
    public static int suma(int num1, int num2) {
        int suma;
    	suma = num1 + num2;
    	return suma;
    }
    public static int resta (int num1, int num2) {
    	int resta;
    	resta = num1 - num2;
    	return resta;
	}
    public static int multiplica (int num1, int num2) {
    	int multiplica;
    	multiplica = num1 * num2;
    	return multiplica;
    }
    public static double dividir (double num1, double num2) {
    	double dividir;
    	dividir = num1 / num2;
    	return dividir;
    }
}
