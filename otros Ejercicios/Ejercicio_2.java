//Diseñe una función que pida el nombre y la edad de N personas e
//imprima los datos de las personas ingresadas por teclado e indique si
//son mayores o menores de edad. Después de cada persona, el programa
//debe preguntarle al usuario si quiere seguir mostrando personas y frenar
//cuando el usuario ingrese la palabra “No”.
package guia4;

import java.util.*;

public class Ejercicio_2 {
    
    public static void main(String[] args) {
       edad(); 
    }
    
    public static void edad() {
        String nombre, salir;
        int edad, mayor, cant;
        Scanner leer = new Scanner(System.in);
        
//        do {
//            System.out.println("Ingrese el nombre de una persona.");
//            nombre = leer.nextLine();
//            System.out.println("Ingrese la edad de la persona.");
//            edad = leer.nextInt();
//            if (edad >= 18){
//                System.out.println("Persona mayor de edad.");
//            } else {
//                System.out.println("Persona menor de edad.");
//            }
//            System.out.println("Desea seguir mostrando personas? Si/No");
//            salir = leer.nextLine();
//        } while (salir.equals("no"));
        salir = "";
        do {
            System.out.println("Ingrese una cantidad de personas.");
            cant = leer.nextInt();
            for (int i = 0; i < cant; i++) {
                System.out.println("Ingrese el nombre de una persona.");
                nombre = leer.next();
                
                System.out.println("Ingrese la edad de la persona.");
                edad = leer.nextInt();
                
                if (edad >= 18) {
                    System.out.println("Nombre: " + nombre + " Edad: " + edad + " Persona mayor de edad.");
                } else {
                    System.out.println("Nombre: " + nombre + " Edad: " + edad + " Persona menor de edad.");
                }
            }
            System.out.println("Desea seguir mostrando personas? Si/No");
            salir = leer.next();
        } while (salir.equals("si"));
    }
}
