package poliformismopoo;

public class EmpleadoAsalariado2 extends Empleado12{
    private double valor_mensual;

    public double getValor_mensual() {
        return valor_mensual;
    }

    public void setValor_mensual(double valor_mensual) {
        this.valor_mensual = valor_mensual;
    }

    /**
     * Metodo Constructor
     * @param nombre
     * @param departamento
     * @param puesto
     * @param valor_mensual
     */
    public EmpleadoAsalariado2(String nombre,  String departamento, String puesto, double valor_mensual){
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.valor_mensual = valor_mensual;
    }

    /**
     * Metodo Abstracto de la clase principal
     */
    @Override
    public void calcularSueldoQna() {
        sueldo = valor_mensual/2;
    }
}
