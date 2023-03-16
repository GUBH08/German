/*
 Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

 */
package guia3.ej1;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Ejex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Que clase de socio es? \nA \nB \nC");
        System.out.println(" ");
        String categoria = leer.nextLine();
        categoria = categoria.toUpperCase();
        System.out.println("Cuanto gastó en el tratamiento?");
        double precio = leer.nextDouble();
        double preciofinal;
        switch (categoria) {
            case "A":
                preciofinal = precio*0.5;
                System.out.println("El precio final a abonar es: $" + preciofinal);
                break;
                 case "B":
                preciofinal = precio*0.35;
                System.out.println("El precio final a abonar es: $" + preciofinal);
                break;
                 case "C":
                preciofinal = precio;
                System.out.println("Ustede es pobre, no recibe descuento, pague un plan mas caro");
                break;
            
        }
    }
    
}
