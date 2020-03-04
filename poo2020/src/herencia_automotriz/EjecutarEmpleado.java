package herencia_automotriz;

import herencia_figura.Circulo;
import herencia_figura.Cuadrado;
import herencia_figura.Rectangulo;
import herencia_figura.Triangulo;

import java.util.Scanner;

public class EjecutarEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        String nombre, cargo, dependencia, rfc;
        double  numero_horas, cuota_hora;
        double sueldo_mensual;
        int cant_trab;
        double costo_trab;

        int opcion1;

        System.out.println("Ingrese el tipo de empleado al que desea calcular el sueldo quincenal");
        System.out.println("1.Administrativo   2.Mecánico   3.Vendedor   5. salir");
        System.out.println("¿De que tipo de empleado desea obtener el sueldo?");
        opcion1 = teclado.nextInt();

        teclado.nextLine();
        switch (opcion1) {
            case 1:
                System.out.println("_________________________________________________");
                System.out.println("Ingrese RFC(Registro Federal de Causantes):");
                rfc = teclado.nextLine();
                System.out.println("Ingrese el Nombre:");
                nombre = teclado.nextLine();
                System.out.println("Ingrese el Cargo:");
                cargo = teclado.nextLine();
                System.out.println("Ingrese la Dependencia a la que pertenece:");
                dependencia = teclado.nextLine();
                System.out.println("Ingrese el salario mensual del empleado:");
                sueldo_mensual = teclado.nextDouble();
                System.out.println("_________________________________________________");

                EmpAdmvo empAdmvo = new EmpAdmvo(rfc, nombre, cargo, dependencia, sueldo_mensual);
                empAdmvo.presentar();

                break;

            case 2:
                System.out.println("_________________________________________________");
                System.out.println("Ingrese RFC(Registro Federal de Causantes):");
                rfc = teclado.nextLine();
                System.out.println("Ingrese el Nombre:");
                nombre = teclado.nextLine();
                System.out.println("Ingrese el Cargo:");
                cargo = teclado.nextLine();
                System.out.println("Ingrese la Dependencia a la que pertenece:");
                dependencia = teclado.nextLine();
                System.out.println("Ingrese el costo del trabajo del empleado:");
                costo_trab = teclado.nextDouble();
                System.out.println("Ingrese la cantidad de trabajos que se realizaron");
                cant_trab = teclado.nextInt();
                System.out.println("_________________________________________________");

                EmpMecanico empMecanico = new EmpMecanico(rfc, nombre, cargo, dependencia,cant_trab);
                empMecanico.presentar();

            }


    }
}
