package herencia;

/**
 * Clase que hereda de Persona, contendra atributos y metodos de la misma
 */
public class Administrativo extends Persona{
    // Atributos propios de la clase
    private String dependencia;

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public void gestionar_procesos() {
        System.out.println("Metodo para gestionar procesos");
    }


    public Administrativo (String dependencia, String nombre, String identificacion, String estado_civ, String fecha_nacimiento){
        this.dependencia = dependencia;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.estado_civ = estado_civ;
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
