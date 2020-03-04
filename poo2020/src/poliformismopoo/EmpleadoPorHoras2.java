package poliformismopoo;

public class EmpleadoPorHoras2 extends Empleado12 {
    // Atributos propios de la clase
    private Double numero_horas;
    private  Double cuota_hora;

    public void setNumero_horas(Double numero_horas) {
        this.numero_horas = numero_horas;
    }

    public void setCuota_hora(Double cuota_hora) {
        this.cuota_hora = cuota_hora;
    }

    @Override
    public void calcularSueldoQna() {
        sueldo = numero_horas*cuota_hora;
    }

    /**
     * Metodo Constructor
     * @param nombre
     * @param departamento
     * @param puesto
     * @param numero_horas
     * @param cuota_hora
     */
    public EmpleadoPorHoras2(String nombre, String departamento, String puesto, double numero_horas, double cuota_hora){
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.numero_horas = numero_horas;
        this.cuota_hora = cuota_hora;
    }

}
