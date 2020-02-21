package arreglosdeberpoo;

public class DatosPersona {
    private String[] nombre = new String[5];
    private int[] edad = new int[5];
    private String[] univer = new String[5];
    private int[] celular = new int[5];

    // Constructor de objeto
    public DatosPersona(String nombre[], int edad[], String univer[], int celular[]) {
        this.nombre = nombre;
        this.edad = edad;
        this.univer = univer;
        this.celular = celular;
    }

    public void presentar() {

        for (int i = 0; i < 5; i++) {

            System.out.println(" __________________________________________________________");
            System.out.println("|NOMBRE:  " + nombre[i]);
            System.out.println("|EDAD:  " + edad[i]);
            System.out.println("|UNIVERSIDAD:  " + univer[i]);
            System.out.println("|CELULAR:  " + celular[i]);
            System.out.println(" __________________________________________________________");

        }
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public int[] getEdad() {
        return edad;
    }

    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    public String[] getUniver() {
        return univer;
    }

    public void setUniver(String[] univer) {
        this.univer = univer;
    }

    public int [] getCelular() {
        return celular;
    }

    public void setCelular(int[] celular) {
        this.celular = celular;
    }
}

