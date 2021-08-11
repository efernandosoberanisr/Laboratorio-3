
package Ejercicio6;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {        
         Scanner entrada = new Scanner(System.in);
        double a, b,a2,b2,suma;
        System.out.println("Ingrese el valor de a");
        a = entrada.nextInt();
        System.out.println("Ingrese el valor de b");
        b = entrada.nextInt();
 
        a2 = Math.pow(a, 2);
        b2 = Math.pow(b, 2);
        
        
        suma = a2+(2*a*b)+b2;
        System.out.println("El resultado es: "+ suma);
        
    }
    
}
