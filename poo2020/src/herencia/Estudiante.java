package herencia;

/**
 * Clase que hereda de Persona, contendra atributos y metodos de la misma
 */
public class Estudiante extends Persona{

    // Atributos propios de la clase
    private String carrera;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void matricular() {
        System.out.println("Metodo para matricular");
    }

    public void aprender() {
        System.out.println("Metodo para aprender");
    }

    /**
     * Constructor
     * @param carrera
     * @param nombre
     * @param identificacion
     * @param estado_civ
     * @param fecha_nacimiento
     */
    public Estudiante (String carrera, String nombre, String identificacion, String estado_civ, String fecha_nacimiento){
        this.carrera = carrera;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.estado_civ = estado_civ;
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
