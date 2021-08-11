package Ejercicio7;
import java.util.Scanner;
import java.util.Scanner;
public class Ejerci7 {

  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int n, semanas, dia, horas;
      
      System.out.println("Ingrese el numero total de horas ");
      n= entrada.nextInt();
      
      semanas = n / 168;
      dia =n%168 /24;
      horas = n%24;
      
      System.out.println("Horas: "+horas);
      System.out.println("Días: "+dia);
      System.out.println("Semanas: "+semanas);
     
    }
      }