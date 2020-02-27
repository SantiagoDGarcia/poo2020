package herencia_empleado;

public class EmpleadoPorHoras extends Empleado {
    private Double numero_horas;
    private  Double cuota_hora;

    public Double getNumero_horas() {
        return numero_horas;
    }

    public void setNumero_horas(Double numero_horas) {
        this.numero_horas = numero_horas;
    }

    public Double getCuota_hora() {
        return cuota_hora;
    }

    public void setCuota_hora(Double cuota_hora) {
        this.cuota_hora = cuota_hora;
    }

    public Double calcular_sueldo(double numero_horas, double cuota_hora){
        double sueldo = numero_horas*cuota_hora;
        return sueldo;
    }

    public EmpleadoPorHoras (String nombre, String cargo, String dependencia, double numero_horas, double cuota_hora){
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.numero_horas = numero_horas;
        this.cuota_hora = cuota_hora;
    }

}
