package deber_seleccion;

import java.util.Scanner;

public class EjecutarEstudiante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre del Estudiante: ");
        String nombreAlum = teclado.nextLine();
        System.out.println("Ingrese calificacion 1: ");
        double calif1 = teclado.nextDouble();
        System.out.println("Ingrese calificacion 2: ");
        double calif2 = teclado.nextDouble();
        System.out.println("Ingrese calificacion 3: ");
        double calif3 = teclado.nextDouble();
        System.out.println("Ingrese calificacion 4: ");
        double calif4 = teclado.nextDouble();


        Estudiante estudiante = new Estudiante(nombreAlum,calif1,calif2,calif3,calif4);
        estudiante.presentar();

    }
}
