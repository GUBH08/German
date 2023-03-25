
package circunferencia;

import static java.lang.Math.pow;
import java.util.Scanner;


public class Circunferencia1 {
    private double radio;

    public Circunferencia1() {
    }

    public Circunferencia1(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        radio = leer.nextDouble();
    }
    public double area(){
        return pow((Math.PI*radio),2);
    }
    public double perimetro(){
        return 2*Math.PI*radio;
    }
}
