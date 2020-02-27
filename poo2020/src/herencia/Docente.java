package herencia;

/**
 * Clase que hereda de Persona, contendra atributos y metodos de la misma
 */
public class Docente extends Persona{

    // Atributos propios de la clase
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String carrera){
        this.area = area;
    }

    public void enseniar() {
        System.out.println("Metodo para enseniar");
    }

    public void calificar() {
        System.out.println("Metodo para calificar");
    }

    /**
     *
     * @param area
     * @param nombre
     * @param identificacion
     * @param estado_civ
     * @param fecha_nacimiento
     */
    public Docente (String area, String nombre, String identificacion, String estado_civ, String fecha_nacimiento){
        this.area = area;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.estado_civ = estado_civ;
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
