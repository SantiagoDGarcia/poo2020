package herencia;
import java.util.Date;
/**
 * Clase Principal o Superclase
 */
public class Persona {

    // Atributos comunes para todas las clases
    protected String nombre;
    protected String identificacion;
    protected String estado_civ;
    protected String fecha_nacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getEstado_civ() {
        return estado_civ;
    }

    public void setEstado_civ(String estado_civ) {
        this.estado_civ = estado_civ;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
