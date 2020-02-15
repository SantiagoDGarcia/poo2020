package disenio_repeticion;

import diseino_seleccion.Empleado;

import java.util.Scanner;

public class EjecutarEmpleadoDOWHILE {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Boolean condi = true;

        do {
            System.out.println("Nombre del Empleado: ");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese cantidad de horas que trabajo el empleado: ");
            double numero_horas = teclado.nextDouble();
            System.out.println("Ingrese el valor de la cuota por cada hora: ");
            double cuota_hora = teclado.nextDouble();

            Empleado empleado = new Empleado(nombre, numero_horas, cuota_hora);
            empleado.presentar();

            condi = false;
            teclado.nextLine();

            System.out.println("Desea ingresar otro Empleado");
            String opcion = teclado.nextLine();
            if (opcion.equals("si") || opcion.equals("SI")){
                condi = true;
            } else{
                condi = false;
            }

        }while (condi);
    }
}

