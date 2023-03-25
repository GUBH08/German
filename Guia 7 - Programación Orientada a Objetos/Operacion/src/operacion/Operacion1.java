
package operacion;

import java.util.Scanner;

/**
 *
 * @author German
 */
public class Operacion1 {
    private int numero1,numero2;

    public Operacion1() {
    }

    public Operacion1(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el 1° numero: ");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el 2° nuemro: ");
        numero2 = leer.nextInt();
    }
    public int sumar(){
        return this.numero1+this.numero2;
    }
    public int restar(){
        return this.numero1-this.numero2;
    }
    public int multiplicacion(){
        return this.numero1*this.numero2;
    }
    public double division(){
        if(numero2!=0){
            return this.numero1/this.numero2;
        } else {
            System.out.println("Error");
            return 0;
        }
    }
    
}
