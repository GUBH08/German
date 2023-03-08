/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author German
 */
public class Ejercicio6B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        int opcion;
        
        System.out.print("Ingrese un valor entre 1 y 4: ");
        opcion = leer.nextInt();
        
        if(opcion==1){
            System.out.println("La bomba es una bomba de agua");
        }else if(opcion==2){
            System.out.println("La bomba es una bomba de gasolina");
        }else if(opcion==3){
            System.out.println("La bomba es una bomba de hormigón");
        }else if(opcion==4){
            System.out.println("La bomba es una bomba de pasta alimenticia");
        }else{
            System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
    
}
