/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferencia;

/**
 *
 * @author German
 */
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia1 A1 = new Circunferencia1();
        A1.crearCircunferencia();
        System.out.println("El area es: " + A1.area());
        System.out.println("El perimetro es: " + A1.perimetro());
    }
    
}
