/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

/**
 *
 * @author German
 */
public class Operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operacion1 op = new Operacion1();
        
        op.crearOperacion();
        System.out.println("La suma es: " + op.sumar());
        System.out.println("La resta es: " + op.restar());
        System.out.println("La multiplicacion es: " + op.multiplicacion());
        System.out.println("La division es: " + op.division());
    }
    
}
