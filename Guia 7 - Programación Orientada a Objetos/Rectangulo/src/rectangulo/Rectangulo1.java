package rectangulo;

import java.util.Scanner;

/**
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluirá un método para
 * crear el rectángulo con los datos del Rectángulo dados por el usuario.
 * También incluirá un método para calcular la superficie del rectángulo y un
 * método para calcular el perímetro del rectángulo. Por último, tendremos un
 * método que dibujará el rectángulo mediante asteriscos usando la base y la
 * altura. Se deberán además definir los métodos getters, setters y
 * constructores correspondientes. Superficie = base * altura / Perímetro =
 * (base + altura) * 2.
 *
 * @author German
 */
public class Rectangulo1 {

    private double base, altura;

    public Rectangulo1() {
    }

    public Rectangulo1(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void datos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        base = leer.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = leer.nextDouble();
    }

    public double superficie() {
        return base * altura;
    }

    public double perimetro() {
        return (base + altura) * 2;
    }

    public void dibujo() {
        if (base <= altura) {
            for (int i = 0; i < base; i++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
            for (int i = 0; i < altura - 2; i++) {
                System.out.println(" *        *");
            }
            for (int i = 0; i < base; i++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        } else {
            System.out.println("Error");
        }
    }
}
