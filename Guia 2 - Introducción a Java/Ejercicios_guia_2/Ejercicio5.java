/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author German
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        JOptionPane.showMessageDialog(null, "El doble es: "+(2*numero1)+"\n"+
                "El triple es: "+(3*numero1)+"\n"+
                "La raiz cuadrada es: "+(Math.sqrt(numero1)));
    }
    
}
