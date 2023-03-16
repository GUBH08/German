/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gerardo.practicaseggextras;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 * Leer la altura de N personas y determinar el promedio de
 * estaturas que se encuentran por debajo de 1.60 mts. y el promedio de
 * estaturas en general.
 */
public class Ejercicio6Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float altura,totalDis=0,totalGeneral=0;
        int cantG=0,cantD=0;
        boolean continuar=true;
        while(continuar){
            System.out.println("Ingrese la altura de la persona");
            altura = leer.nextFloat();
            cantG++;
            totalGeneral+=altura;
            if(altura < 1.60){
                cantD++;
                totalDis+=altura;
            }
            System.out.println("¿Desea continuar con la carga?s/n");
            if("s".equals(leer.next().toLowerCase())){
                continuar=true;
            }else {
                continuar=false;
            }
        }
        System.out.println("El promedio general de altura es de: "+(totalGeneral/cantG));
        System.out.println("El promedio de altura menor a 1.60 es de: "+(totalDis/cantD));
        
    }
    
}
