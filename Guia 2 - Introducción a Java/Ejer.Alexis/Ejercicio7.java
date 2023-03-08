/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alexisrl.practicas;
import javax.swing.JOptionPane;

/**
 *
 * @author ALEXIS.R.L
 * Implementar un programa que dado dos números enteros
 * determine cuál es el mayor y lo muestre por pantalla.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int numero1,numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero"));
        
           if (numero1==numero2){
               JOptionPane.showMessageDialog(null, "es el mismo culiado");
           } else
           if (numero1>numero2){
               JOptionPane.showMessageDialog(null, "el primer numero es el mayor");
           } else{
               JOptionPane.showMessageDialog(null,"El numero mayor es el segundo");
        }
        
        
    }
}
