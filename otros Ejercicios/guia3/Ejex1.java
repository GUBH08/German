/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo,
si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package guia3.ej1;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ejex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos");
        int min = leer.nextInt();
        int dias = min / 1440;
        int horas = (min - 1440) / 60;

        System.out.println("Los " + min + " minutos ingresados son equivalentes a " + dias + " dias " + horas + " horas.");
    }

}
