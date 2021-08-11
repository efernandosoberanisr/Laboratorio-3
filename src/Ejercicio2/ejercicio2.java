//Ejercicio1
package Ejercicio2;
import java.util.Scanner;
public class ejercicio2 {
     public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
        float suel, sue_hora,hor;
         
        System.out.println("Ingrese salario");
        sue_hora = entrada.nextFloat();
        System.out.println("Ingrese el total de horas");
        hor= entrada.nextInt();
        
        suel = sue_hora * hor;
        
        System.out.println("El salario total es: "+ suel);
        }
    }