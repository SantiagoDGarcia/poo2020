package poliformismopoo;

import java.util.Scanner;

public class EjecutarEmpleado12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variables
        String nombre, departamento, puesto;
        double  numero_horas, cuota_hora;
        double valor_mensual;

        System.out.println("¿Que desea realizar? Ingrese el numero de opcion");
        System.out.println("1. Calcular Sueldo de empleado por horas");
        System.out.println("2. Calcular Sueldo de empleado Asalariado");
        System.out.println(" Ingrese el numero de las opciones ");

        int opcion = teclado.nextInt();
        teclado.nextLine();
        if (opcion == 1){
            // Obtener el sueldo mensual de un empleado por horas
            System.out.println("_________________________________________________");
            System.out.println("Ingrese el Nombre:");
            nombre = teclado.nextLine();
            System.out.println("Ingrese el Departamento al que pertence:");
            departamento = teclado.nextLine();
            System.out.println("Ingrese el puesto del empleado:");
            puesto = teclado.nextLine();
            System.out.println("Ingrese el numero de horas de trabajo del empleado:");
            numero_horas = teclado.nextDouble();
            System.out.println("Ingrese la cuota por hora del empleado:");
            cuota_hora = teclado.nextDouble();


            EmpleadoPorHoras2 empleadoPorHoras2 = new EmpleadoPorHoras2(nombre,departamento,puesto,numero_horas,cuota_hora);
            System.out.println("DATOS DEL EMPLEADO");
            System.out.println("Nombre: "+empleadoPorHoras2.getNombre());

            // Se calcula el sueldo
            empleadoPorHoras2.calcularSueldoQna();
            System.out.println("Sueldo: "+empleadoPorHoras2.getSueldo());

        } else{
            if (opcion == 2){
                System.out.println("_________________________________________________");
                System.out.println("Ingrese el Nombre:");
                nombre = teclado.nextLine();
                System.out.println("Ingrese el Departamento al que pertence:");
                departamento = teclado.nextLine();
                System.out.println("Ingrese el puesto del empleado:");
                puesto = teclado.nextLine();
                System.out.println("Ingrese el valor mensual de salario del empleado:");
                valor_mensual = teclado.nextDouble();


                EmpleadoAsalariado2 empleadoAsalariado2 = new EmpleadoAsalariado2(nombre,departamento,puesto,valor_mensual);
                System.out.println("DATOS DEL EMPLEADO");
                System.out.println("Nombre: "+empleadoAsalariado2.getNombre());
                System.out.println("Sueldo Mensual: "+empleadoAsalariado2.getValor_mensual());

                empleadoAsalariado2.calcularSueldoQna();
                System.out.println("Sueldo: "+empleadoAsalariado2.getSueldo());
            }
            else{
                System.out.println("Opcion Incorrecta");
            }
        }

    }
}
