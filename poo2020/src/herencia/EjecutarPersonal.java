package herencia;
import java.util.Date;
import java.util.Scanner;

public class EjecutarPersonal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variables
        String nombre, identificacion, estado_civ, fecha_nac;
        String carrera;
        String area;
        String dependencia;

        System.out.println("_________________________________________________");
        System.out.println("CREACIÓN OBJETO ESTUDIANTE");
        System.out.println("Ingrese el Nombre:");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la identificacion:");
        identificacion = teclado.nextLine();
        System.out.println("Ingrese la carrera:");
        carrera = teclado.nextLine();
        System.out.println("Ingrese el Estado Civil:");
        estado_civ = teclado.nextLine();
        System.out.println("Ingrese la fecha de nacimiento:");
        fecha_nac = teclado.nextLine();

        //Creacion Objeto de Estudiante
        Estudiante estudiante = new Estudiante(carrera,nombre,identificacion,estado_civ,fecha_nac);
        /*
        estudiante.setNombre(nombre);
        estudiante.setIdentificacion(identificacion);
        estudiante.setCarrera(carrera);
        estudiante.setEstado_civ(estado_civ);
        estudiante.setFecha_nacimiento(fecha_nac);
        */

        System.out.println("DATOS OBJETO ESTUDIANTE");
        System.out.println("nombre: "+estudiante.getNombre());
        System.out.println("identificacion: "+estudiante.getIdentificacion());
        System.out.println("carrera: "+estudiante.getCarrera());
        System.out.println("estado Civil: "+estudiante.getEstado_civ());
        System.out.println("fecha nacimiento: "+estudiante.getFecha_nacimiento());


        //Creacion Objeto de Docente
        System.out.println("_________________________________________________");
        System.out.println("CREACIÓN OBJETO DOCENTE");
        System.out.println("Ingrese el Nombre:");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la identificacion:");
        identificacion = teclado.nextLine();
        System.out.println("Ingrese el area:");
        area = teclado.nextLine();
        System.out.println("Ingrese el Estado Civil:");
        estado_civ = teclado.nextLine();
        System.out.println("Ingrese la fecha de nacimiento:");
        fecha_nac = teclado.nextLine();

        Docente docente = new Docente(area,nombre,identificacion,estado_civ,fecha_nac);

        System.out.println("DATOS OBJETO DOCENTE");
        System.out.println("nombre: "+docente.getNombre());
        System.out.println("identificacion: "+docente.getIdentificacion());
        System.out.println("area: "+docente.getArea());
        System.out.println("estado Civil: "+docente.getEstado_civ());
        System.out.println("fecha nacimiento: "+docente.getFecha_nacimiento());
        System.out.println("_________________________________________________");


        //Creacion Objeto de Administrativo

        System.out.println("CREACIÓN OBJETO ADMINISTRATIVO");
        System.out.println("Ingrese el Nombre:");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la identificacion:");
        identificacion = teclado.nextLine();
        System.out.println("Ingrese el area:");
        dependencia = teclado.nextLine();
        System.out.println("Ingrese el Estado Civil:");
        estado_civ = teclado.nextLine();
        System.out.println("Ingrese la fecha de nacimiento:");
        fecha_nac = teclado.nextLine();

        Administrativo administrativo = new Administrativo(dependencia,nombre,identificacion,estado_civ,fecha_nac);

        System.out.println("DATOS OBJETO ADMINISTRATIVO");
        System.out.println("nombre: "+administrativo.getNombre());
        System.out.println("identificacion: "+administrativo.getIdentificacion());
        System.out.println("dependencia: "+administrativo.getDependencia());
        System.out.println("estado Civil: "+administrativo.getEstado_civ());
        System.out.println("fecha nacimiento: "+administrativo.getFecha_nacimiento());
        System.out.println("_________________________________________________");


    }
}
