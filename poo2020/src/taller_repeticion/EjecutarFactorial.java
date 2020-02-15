package taller_repeticion;

import java.util.Scanner;
public class EjecutarFactorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número a extraer Facctorial");
        int numero= teclado.nextInt();
        int acumulador =1;
        Factorial factorial  = new Factorial(numero,acumulador );
        factorial.getinfo();
    }
}
