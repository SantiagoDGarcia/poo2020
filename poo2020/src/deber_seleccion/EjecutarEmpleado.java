package deber_seleccion;
import java.util.Scanner;

public class EjecutarEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre del Empleado: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese cantidad de horas que trabajo el empleado: ");
        double numero_horas = teclado.nextDouble();
        System.out.println("Ingrese el valor de la cuota por cada hora: ");
        double cuota_hora = teclado.nextDouble();

        Empleado empleado = new Empleado(nombre, numero_horas, cuota_hora);
        empleado.presentar();
    }
}

