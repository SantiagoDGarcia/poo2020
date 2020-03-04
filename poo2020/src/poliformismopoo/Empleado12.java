package poliformismopoo;

public abstract class Empleado12 {
    // Definicion de atributos para ser heredados
    protected String nombre;
    protected String departamento;
    protected String puesto;
    protected double sueldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    // No se requiere ya que es abstracto
    /*
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    */

    /**
     * Declaracion Metodo Abstracto
     **/
    public abstract void calcularSueldoQna();
}
