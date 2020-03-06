package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEstudiante {
    public static void main(String[] args) {
        // Creacion de una lista en java, para almacenar valores cadena
        // Se almacena valores de tipo vehiculo
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();

        Scanner teclado = new Scanner(System.in);
        String nombre,  cedula, carrera, correo;
        int edad ;


        boolean bandera = true;
        int opcion = 1;

        do {
            System.out.println("___________________________");
            System.out.println("SISTEMA INGRESO DE DATOS ESTUDIANTES");
            System.out.println("___________________________");
            System.out.println("1. Añadir Estudiante");
            System.out.println("2. Presentar Ficha Estudiantes");
            System.out.println("3. Salir del Programa");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:

                    int cont = 0;
                    System.out.println("___________________________");
                    System.out.println("Ingrese el nombre del Estudiante");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese la cedula del Estudiante");
                    cedula = teclado.nextLine();
                    System.out.println("Ingrese la edad del Estudiante");
                    edad = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la carrera del Estudiante");
                    carrera = teclado.nextLine();
                    System.out.println("Ingrese el correo del Estudiante");
                    correo = teclado.nextLine();

                    // Creacion del Objeto
                    Estudiante estudiante = new Estudiante(nombre, cedula, edad, carrera, correo);

                    // Se añade a la lista
                    estudiantes.add(estudiante);
                    break;

                case 2:
                    System.out.println("___________________________");
                    System.out.println("Lista de Estudiantes:");
                    // For para imprimir la lista
                    for(Estudiante listEst: estudiantes){
                        //System.out.println(listVeh);
                        System.out.println("___________________________");
                        System.out.println("Nombre: "+listEst.getNombre());
                        System.out.println("Cedula: "+listEst.getCedula());
                        System.out.println("Edad: "+listEst.getEdad());
                        System.out.println("Carrera: "+listEst.getCarrera());
                        System.out.println("Correo: "+listEst.getCorreo());
                    }
                    System.out.println("___________________________");
                    break;
                case 3:
                    System.out.println("___________________________");
                    System.out.println("Gracias. Fin del Programa");
                    System.out.println("___________________________");
                    bandera = false;
            }
        } while(bandera);

    }
}
