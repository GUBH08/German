/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alexisrl.practicas;

import javax.swing.JOptionPane;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y
 * el programa deberá mostrar el resultado por pantalla y luego volver al menú.
 * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta
 * que, si el usuario selecciona la opción 5, en vez de salir del programa
 * directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
 * seguro que desea salir del programa (S/N)? Si el usuario selecciona el
 * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el
 * menú.
 *
 * @author ALEXIS.R.L
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        int opcion;
        String confirmacion="";
        do{
            numero1=(int) Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
            numero2=(int) Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero"));
            opcion=(int) Integer.parseInt(JOptionPane.showInputDialog(  "    MENU\n"+"1.SUMA\n"+"2.RESTA\n"+"3.MULTIUPLICAR\n"+"4.DIVIDIR\n"+"5.SALIR\n"));
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null,numero1+"+"+numero2+"="+(numero1+numero2));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,numero1+"-"+numero2+"="+(numero1-numero2));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,numero1+"*"+numero2+"="+(numero1*numero2));
                    break;
                case 4:
                    if (numero2>0){
                        JOptionPane.showMessageDialog(null,numero1+"/"+numero2+"="+(numero1/numero2));
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null,"indeterminado".toUpperCase());
                        break;
                    }
                case 5:
                    confirmacion=(JOptionPane.showInputDialog("¿Seguro que desea salir? S/N"));
                    break;
                default: System.out.println("opcion invalida");
                    
            }
        }while(!(confirmacion.equalsIgnoreCase("s")));
      
        
    }
    
}
