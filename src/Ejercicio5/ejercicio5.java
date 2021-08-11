
package Ejercicio5;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         float  segu, exa,tfinal,par, prim;
         
        System.out.println("Ingrese el porcentaje  sobre 10%: ");
        par = entrada.nextFloat();
        System.out.println("Ingrese el porcentaje  sobre 25%: ");
        prim = entrada.nextFloat();
        System.out.println("Ingrese el porcentaje  sobre 25%: ");
        segu = entrada.nextFloat();
        System.out.println("Ingrese el porcentaje del Examen Final sobre 40%: ");
        exa = entrada.nextFloat();
        
        tfinal = par + prim + segu + exa;
        
        System.out.println("La calificacion Final es de: "+ tfinal + "%");
    }
    
}
