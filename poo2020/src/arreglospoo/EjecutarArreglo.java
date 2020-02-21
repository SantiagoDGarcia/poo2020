package arreglospoo;

import java.util.Scanner;

public class EjecutarArreglo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] vectorA = new int[10];
        int[] vectorB = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese valor al vector A posicion: " + i);
            vectorA[i] = teclado.nextInt();
            System.out.println("Ingrese valor al vector B posicion: " + i);
            vectorB[i] = teclado.nextInt();
        }

        Arreglo arreglo = new Arreglo(vectorA, vectorB);

        arreglo.presentar();
    }
}
