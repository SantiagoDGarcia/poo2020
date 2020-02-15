package taller_repeticion;

import java.util.Scanner;

public class EjecutarNumDiv {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer numero a restar.");
        double num1 = teclado.nextDouble();
        System.out.println("Ingrese el segundo numero a restar.");
        double num2 = teclado.nextDouble();

        NumDiv numDiv = new NumDiv();
        numDiv.establecerNum1(num1);
        numDiv.establecerNum2(num2);
        numDiv.calcularDivision();
        System.out.println("El resultado de la division es: " + numDiv.obtenerDivision());
    }
}

