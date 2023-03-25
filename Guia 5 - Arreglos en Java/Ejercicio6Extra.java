package ArregleVectoresMatrices;

import java.util.Scanner;

/**
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
 * a medida que el usuario las va ingresando, construya una “sopa de letras para
 * niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en
 * orden horizontal en una fila que será seleccionada de manera aleatoria. Una
 * vez concluida la ubicación de las palabras, rellene los espacios no
 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
 * pantalla la sopa de letras creada. Nota: Para resolver el ejercicio deberá
 * investigar cómo se utilizan las siguientes funciones de Java substring(),
 * Length() y Math.random().
 *
 * @author ALEXIS.R.L
 */
public class Ejercicio6Extra {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] palabras = new String[5];
        char[][] sopa = new char[20][20];
        int filaSeleccionada = (int) (Math.random() * 20);

        for (int i = 0; i < palabras.length; i++) {
            System.out.printf("Ingrese la palabra de 3 a 5 letras: ", i + 1);
            palabras[i] = input.nextLine();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("Error: la palabra debe tener de 3 a 5 letras.");
                System.out.printf("Ingrese la palabra de 3 a 5 letras: ", i + 1);
                palabras[i] = input.nextLine();
            }
        }
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                if (i == filaSeleccionada) {
                    int k = j / 3;
                    if (k < palabras.length && j % 3 == 0 && j + palabras[k].length() <= sopa[i].length) {
                        for (int l = 0; l < palabras[k].length(); l++) {
                            sopa[i][j + l] = palabras[k].charAt(l);
                        }
                        j += palabras[k].length() - 1;
                    } else {
                        // Rellenar con un número aleatorio del 0 al 9
                        sopa[i][j] = (char) (Math.random() * 10 + '0');
                    }
                } else {
                    // Rellenar con un número aleatorio del 0 al 9
                    sopa[i][j] = (char) (Math.random() * 10 + '0');
                }
            }
        }
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
/*El tipo de dato char sirve para guardar estos caracteres. 
*Un tipo especial de carácter es la secuencia de escape, similares a las del 
*lenguaje C/C++, que se utilizan para representar caracteres de control o caracteres 
*que no se imprimen.
*
 */
