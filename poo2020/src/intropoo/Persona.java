package intropoo;

public class Persona {
    private String genero;
    private String religion;
    private int edad;
    private String nombre;

    public Persona(String genero, String religion, int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
        this.religion = religion;
    }

    public Persona(String genero, String religion, int edad) {
        this.edad = edad;
        this.genero = genero;
        this.religion = religion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
