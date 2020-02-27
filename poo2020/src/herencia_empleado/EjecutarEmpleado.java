package herencia_empleado;

import java.util.Scanner;

public class EjecutarEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variables
        String nombre, cargo, dependencia;
        double  numero_horas, cuota_hora;
        double valor_mensual;

        System.out.println("¿Que desea realizar? Ingrese el numero de opcion");
        System.out.println("1. Calcular Sueldo de empleado por horas");
        System.out.println("2. Calcular Sueldo de empleado Asalariado");
        System.out.println(" Ingrese el numero de las opciones ");

        int opcion = teclado.nextInt();
        teclado.nextLine();
        if (opcion == 1){
            System.out.println("_________________________________________________");
            System.out.println("Ingrese el Nombre:");
            nombre = teclado.nextLine();
            System.out.println("Ingrese el Cargo:");
            cargo = teclado.nextLine();
            System.out.println("Ingrese la Dependencia a la que pertenece:");
            dependencia = teclado.nextLine();
            System.out.println("Ingrese el numero de horas de trabajo del empleado:");
            numero_horas = teclado.nextDouble();
            System.out.println("Ingrese la cuota por hora del empleado:");
            cuota_hora = teclado.nextDouble();

            EmpleadoPorHoras empleadoH = new EmpleadoPorHoras(nombre,cargo,dependencia,numero_horas,cuota_hora);


            System.out.println("DATOS DEL EMPLEADO");
            System.out.println("Nombre: "+empleadoH.getNombre());
            System.out.println("Cargo: "+empleadoH.getCargo());
            System.out.println("Dependencia: "+empleadoH.getDependencia());
            System.out.println("Sueldo: "+empleadoH.calcular_sueldo(numero_horas,cuota_hora));

        } else{
            if (opcion == 2){
                System.out.println("_________________________________________________");
                System.out.println("Ingrese el Nombre:");
                nombre = teclado.nextLine();
                System.out.println("Ingrese el Cargo:");
                cargo = teclado.nextLine();
                System.out.println("Ingrese la Dependencia a la que pertenece:");
                dependencia = teclado.nextLine();
                System.out.println("Ingrese el valor mensual de salario del empleado:");
                valor_mensual = teclado.nextDouble();

                EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(nombre,cargo,dependencia,valor_mensual);

                System.out.println("DATOS DEL EMPLEADO");
                System.out.println("Nombre: "+empleadoAsalariado.getNombre());
                System.out.println("Cargo: "+empleadoAsalariado.getCargo());
                System.out.println("Dependencia: "+empleadoAsalariado.getDependencia());
                System.out.println("Sueldo: "+empleadoAsalariado.getValor_mensual());

            }
            else{
                System.out.println("Opcion Incorrecta");
            }
        }

    }
}
