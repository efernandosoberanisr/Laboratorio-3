
package Ejercicios4;
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         float  total,comi, canti,venta, porc;
        System.out.println("Ingrese la cantidad de ventas");
        canti= entrada.nextInt();
        System.out.println("Ingrese el total de carros vendidos");
        venta= entrada.nextFloat();
        porc = (venta * 5) / 100;
        comi= canti*150;
        
        total = 1000 +porc+ comi ;
        
        System.out.println("El salario total mensual es de: "+ total);
    }
}
