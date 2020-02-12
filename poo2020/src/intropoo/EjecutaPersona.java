package intropoo;

public class EjecutaPersona{
    public static void main(String [] args){
        // Creacion de Objeto

        Persona persona = new Persona("Masculino","Catolica",10,"Adrian");
        System.out.println(persona.getNombre());
        System.out.println("edad: " +persona.getEdad());
        System.out.println("religion: " +persona.getReligion());
        System.out.println("genero: " +persona.getGenero());
        // Creacion de Objeto con constructor 2
        Persona persona2 = new Persona("Masculino","Catolica",10);
        Persona persona3 = new Persona("Femenino","Catolica",15);
        System.out.println("Edad Persona 2: "+persona2.getEdad());
        System.out.println("Edad Persona 3: "+persona3.getEdad());
        System.out.println("Nombre Persona 2: "+persona2.getNombre());


    }
}
