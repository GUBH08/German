
import java.util.Scanner;

/*
EJERCICIO 7: Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia 
distinta de FDE, que no respete el formato se considera incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */


public class ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese las cadenas de 5 caracteres max. Puedes salir con '&&&&' ");
        
        String cadena = " ";
        int cant1 = 0;
        int cant2 = -1;
        
        do{
            cadena = leer.nextLine();
            if(cadena.length() <= 5 && cadena.substring(0, 1).equals("X") &&  cadena.substring(cadena.length()-1, cadena.length()).equals("O")){
                cant1 ++;
            }else{
                cant2 ++;
            }
            
        }while(!cadena.equals("&&&&"));
        
        System.out.println("Hay " + cant1 + " correctas y " + cant2 + " incorrectas");
    }
    
}
