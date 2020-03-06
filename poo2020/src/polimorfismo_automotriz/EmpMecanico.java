package polimorfismo_automotriz;

public class EmpMecanico extends Empleado{
    protected double costo_trab;
    protected int cant_trab;

    public double getCosto_trab() {
        return costo_trab;
    }

    public void setCosto_trab(double costo_trab) {
        this.costo_trab = costo_trab;
    }

    public int getCant_trab() {
        return cant_trab;
    }

    public void setCant_trab(int cant_trab) {
        this.cant_trab = cant_trab;
    }

    @Override
    public void calcularSueldo() {
        Double valorT = cant_trab*costo_trab;
        sueldo = valorT*0.04;
    }

    public EmpMecanico(String rfc, String nombre, String departamento, String puesto, double costo_trab, int cant_trab){
        this.rfc = rfc;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.costo_trab = costo_trab;
        this.cant_trab = cant_trab;
    }
}
