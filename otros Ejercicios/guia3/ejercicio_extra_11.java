//Escribir un programa que lea un número entero y devuelva el número de
//dígitos que componen ese número. Por ejemplo, si introducimos el
//número 12345, el programa deberá devolver 5. Calcular la cantidad de
//dígitos matemáticamente utilizando el operador de división. Nota:
//recordar que las variables de tipo entero truncan los números o
//resultados.

package guia3;

import java.util.*;

public class ejercicio_extra_11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        double num, i = 0;
        System.out.println("Ingrese un número.");
        num = leer.nextInt();
       
        do {
           i = num % 10;
           num = Math.floor(num/10);
           contador++;
        } while (num!=0);
        System.out.println("El número tiene "+contador+" digitos");
    }
    
}
