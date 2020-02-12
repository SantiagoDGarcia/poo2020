package diseniopoo;

import java.util.Scanner;

public class EjecutarEstudiante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre del Estudiante: ");
        String nomb = teclado.nextLine();
        System.out.println("Cédula: ");
        int nro_cedula = teclado.nextInt();
        System.out.println("Ingrese promedio del Primer Bimestre: ");
        double nota_1_bim = teclado.nextDouble();
        System.out.println("Ingrese promedio del Segundo Bimestre: ");
        double nota_2_bim = teclado.nextDouble();


        Estudiante estudiante = new Estudiante(nro_cedula, nomb,nota_1_bim,nota_2_bim);

        estudiante.presentar();
    }
}
