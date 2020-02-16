package deber_seleccion;

import java.util.Scanner;

public class EjecutarNumMayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer número para evaluar: ");
        int numA = teclado.nextInt();
        System.out.println("Ingrese el segundo número para evaluar: ");
        int numB = teclado.nextInt();
        System.out.println("Ingrese el tercero número para evaluar: ");
        int numC = teclado.nextInt();
        System.out.println("Ingrese el cuarto número para evaluar: ");
        int numD = teclado.nextInt();
        NumMayor numMayor = new NumMayor(numA,numB,numC,numD);

        numMayor.presentar();
    }
}
