
package Ejercicio8;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        double a, b, c,b2,op1,x,total2, m,resul, total;
        System.out.println("Ingrese el valor de a: ");
        a = entrada.nextInt();
        System.out.println("Ingrese el valor de b: ");
        b = entrada.nextInt();
        System.out.println("Ingrese el valor de c: ");
        c = entrada.nextInt();

         b2 = Math.pow(b, 2);
        
        x= (4 * a * c);
        op1 = b2 - x;

        resul = Math.sqrt(op1);
        System.out.println("La raiz es: " + resul);
        m = a * 2;
        total = (-(b) + (resul)) / m;

        System.out.println("El valor para x es:  " + total);
        total2 = (-(b) - (resul)) / m;
        System.out.println("El valor para x2 es:  " + total2);
    }
    
}
