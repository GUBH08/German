/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alexisrl.practicas;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Una obra social tiene tres clases de socios: Los socios tipo ‘A’ abonan una
 * cuota mayor, pero tienen un 50% de descuento en todos los tipos de
 * tratamientos. Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35%
 * de descuento para los mismos tratamientos que los socios del tipo A. Los
 * socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
 * tratamientos. Solicite una letra (carácter) que representa la clase de un
 * socio, y luego un valor real que represente el costo del tratamiento (previo
 * al descuento) y determine el importe en efectivo a pagar por dicho socio.
 *
 * @author ALEXIS.R.L
 */
public class Ejercicio5Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("¿que categoria es?");
        System.out.println("1.A 2.B 3.C");
        int cate = leer.nextInt();
        float importe = 0;
        if (cate >= 1 && cate <= 3) {
            System.out.println("ingrese el importe a pagar");
            importe = leer.nextFloat();
            switch (cate) {
                case 1:
                    System.out.println("El total con descuento es: " + (importe * 0.5));
                    break;
                case 2:
                    System.out.println("El total con descuento es: " + (importe - importe * 0.35));
                    break;
                case 3:
                    System.out.println("No recive ningun descuento" + importe);
                    break;
            }
        } else {
            System.out.println("La categoria es incorrecta");
        }

    }

}
