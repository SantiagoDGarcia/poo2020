package polimorfismo_automotriz;

public class EmpAdmvo extends Empleado {
    private Double sueldo_mensual;


    public Double getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(Double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    @Override
    public void calcularSueldo() {
        sueldo = sueldo_mensual/2;
    }

    public EmpAdmvo( String rfc, String nombre, String cargo, String dependencia, double sueldo_mensual){
        this.rfc = rfc;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.sueldo_mensual = sueldo_mensual;
    }
}
