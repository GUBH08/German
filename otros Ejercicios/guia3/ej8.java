
import java.util.Scanner;

/*
EJERCICIO 8: Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 */


public class ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la medida del cuadrado: ");
        int n = leer.nextInt();
        
        for(int i = 0; i < n; i++ ){
            for(int x = 0; x< n ; x++){
                if(i>0 && i<n-1 && x>0 && x<n-1){
                System.out.print("   ");
                }else{
                    System.out.print(" * ");
                    }
            }
            System.out.print("\n");
            
        }
       
    }
    
}
