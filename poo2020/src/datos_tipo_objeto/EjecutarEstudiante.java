package datos_tipo_objeto;

import java.util.Scanner;

public class EjecutarEstudiante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaracion de variables
        int cont = 0;
        int opcion;
        Estudiante estudiante;
        Estudiante [] estudiantes = new Estudiante[3];
        boolean bandera = true;

        System.out.println("Digite los datos de 3 estudiantes");
        for(cont = 0; cont < estudiantes.length; cont ++) {

                Estudiante est = new Estudiante();
                System.out.println("Ingrese nombre");
                est.setNombre(teclado.nextLine());
                System.out.println("Ingrese cedula");
                est.setCedula(teclado.nextLine());
                System.out.println("Ingrese edad");
                est.setEdad(teclado.nextInt());
                teclado.nextLine();
                System.out.println("Ingrese carrera");
                est.setCarrera(teclado.nextLine());
                System.out.println("Ingrese correo");
                est.setCorreo(teclado.nextLine());
                // Asignamos el objeto est a la variable estudiante
                // estudiante = est;

                // Asignamos el objeto est a la lista estudiantes
                estudiantes[cont] = est;
        }
        System.out.println("Valores de estudiante");
        int edad_acum = 0;
        for (cont = 0; cont < estudiantes.length; cont ++){
            // Obtencion de los valores que contiene el tipo de Estudiante
            System.out.println("Cedula");
            System.out.println(estudiantes[cont].getCedula());
            System.out.println("Nombre");
            System.out.println(estudiantes[cont].getNombre());

            edad_acum = estudiantes[cont].getEdad() + edad_acum;
        }

        System.out.println("Edad promedio de los estudiantes: "+(edad_acum/estudiantes.length));
        System.out.println("Fin...");
    }
}
