package alexisrl.practicas;


import java.util.Scanner;


/**
 *Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
 * debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
 * números pares y la cantidad de números impares. Al igual que en el ejercicio anterior 
 * los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 *
 * @author ALEXIS.R.L
 */
public class Ejercicio8Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 0, numPar = 0, numImp = 0, numGene = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("ingrese un numero");

            numero = teclado.nextInt();
            numGene++;
            if (numero % 2 == 0) {
                numPar++;

            } else {
                numImp++;
            }
        } while (numero % 5 != 0);
        System.out.println("la cantidad de numero leidos son: " + numGene);
        System.out.println("la cantidad de numero impares son: " + numImp);
        System.out.println("la cantidad de numero pares son: " + numPar);
        teclado.close();
    }

}
