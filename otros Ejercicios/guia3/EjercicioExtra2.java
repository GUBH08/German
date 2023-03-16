/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alexisrl.practicas;

/**
 * @author ALEXIS.R.L 
 * Declarar cuatro variables de tipo entero A, B, C y D y
 * asignarle un valor diferente a cada una. A continuación, realizar las
 * instrucciones necesarias para que: B tome el valor de C, C tome el valor de
 * A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales
 * y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A=1,B=2,C=3,D=4,aux;
        System.out.println("los valores iniciales son: " + A + " " + B + " " + C + " " + D);
        aux=B;
        
        B=C; //B= a 3
        
        C=A; //C= a 1
        
        A=D; //A= a 4
        
        D=aux; //D=aux=2
        System.out.println("los valores intercambiados son: " + A + " " + B + " " + C + " " + D);
        
    }
    
}
