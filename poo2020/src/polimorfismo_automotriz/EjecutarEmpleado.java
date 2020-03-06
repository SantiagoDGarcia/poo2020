package polimorfismo_automotriz;

import java.util.Scanner;

public class EjecutarEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre, departamento, puesto, rfc;
        double  numero_horas, cuota_hora;
        double sueldo_mensual;
        int cant_trab;
        double costo_trab;
        double sueld_min;
        int cant_vent;
        String cadena = "";

        int opcion1;
        do {
            System.out.println("Ingrese el tipo de empleado al que desea calcular el sueldo quincenal");
            System.out.println("1.Administrativo   2.Mecánico   3.Vendedor   4.Salir/presentar nómina");
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
                    System.out.println("Ingrese el Departamento al que pertence:");
                    departamento = teclado.nextLine();
                    System.out.println("Ingrese el puesto del empleado:");
                    puesto = teclado.nextLine();
                    System.out.println("Ingrese el salario mensual del empleado:");
                    sueldo_mensual = teclado.nextDouble();
                    System.out.println("_________________________________________________");

                    EmpAdmvo empAdmvo = new EmpAdmvo(rfc, nombre, departamento, puesto, sueldo_mensual);
                    empAdmvo.calcularSueldo();


                    cadena = String.format("%s%s      %s       %s      %s      %s\n", cadena, rfc, nombre,
                            departamento, puesto, empAdmvo.getSueldo());
                    break;

                case 2:

                    System.out.println("_________________________________________________");
                    System.out.println("Ingrese RFC(Registro Federal de Causantes):");
                    rfc = teclado.nextLine();
                    System.out.println("Ingrese el Nombre:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el Departamento al que pertence:");
                    departamento = teclado.nextLine();
                    System.out.println("Ingrese el puesto del empleado:");
                    puesto = teclado.nextLine();
                    System.out.println("Ingrese el costo del trabajo del empleado:");
                    costo_trab = teclado.nextDouble();
                    System.out.println("Ingrese la cantidad de trabajos que se realizaron");
                    cant_trab = teclado.nextInt();
                    System.out.println("_________________________________________________");

                    EmpMecanico empMecanico = new EmpMecanico(rfc, nombre, departamento, puesto, costo_trab,cant_trab);
                    empMecanico.calcularSueldo();

                    cadena = String.format("%s%s      %s       %s      %s      %s\n", cadena, rfc, nombre,
                            departamento, puesto, empMecanico.getSueldo());
                    break;

                case 3:
                    System.out.println("_________________________________________________");
                    System.out.println("Ingrese RFC(Registro Federal de Causantes):");
                    rfc = teclado.nextLine();
                    System.out.println("Ingrese el Nombre:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el Departamento al que pertence:");
                    departamento = teclado.nextLine();
                    System.out.println("Ingrese el puesto del empleado:");
                    puesto = teclado.nextLine();
                    System.out.println("Ingrese el sueldo minimo del empleado:");
                    sueld_min = teclado.nextDouble();
                    System.out.println("Ingrese la cantidad de ventas que realizo:");
                    cant_vent = teclado.nextInt();
                    System.out.println("_________________________________________________");

                    EmpVendedor empVendedor = new EmpVendedor(rfc, nombre, departamento, puesto, sueld_min,cant_vent);
                    empVendedor.calcularSueldo();

                    cadena = String.format("%s%s      %s       %s      %s      %s\n", cadena, rfc, nombre,
                            departamento, puesto, empVendedor.getSueldo());
                    break;

                case 4:
                    System.out.println("  ---------------REPORTE DE NOMINA QUINCENAL---------------\n" +
                            "RFC      Nombre           Depto.          Puesto          Sueldo Quincenal\n" +
                            "____________________________________________________________________\n");
                    System.out.println(cadena);

            }

        }while (opcion1 != 4);

    }
}
