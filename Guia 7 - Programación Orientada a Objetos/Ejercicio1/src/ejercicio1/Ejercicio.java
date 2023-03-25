package ejercicio1;

import java.util.Scanner;

public class Ejercicio {

    private int ISBN;
    private String Titulo;
    private String Autor;
    private int numero_de_pagina;

    public Ejercicio() {
    }

    public Ejercicio(int ISBN, String Titulo, String Autor, int numero_de_pagina) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numero_de_pagina = numero_de_pagina;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumero_de_pagina() {
        return numero_de_pagina;
    }

    public void setNumero_de_pagina(int numero_de_pagina) {
        this.numero_de_pagina = numero_de_pagina;
    }

    public void datos() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el titulo: ");
        this.Titulo = leer.next();
        System.out.print("Ingrese el numero ISBN: ");
        this.ISBN = leer.nextInt();
        System.out.print("Ingrese el autor: ");
        this.Autor = leer.next();
        System.out.print("Ingrese el numero de paginas: ");
        this.numero_de_pagina = leer.nextInt();
    }
}
