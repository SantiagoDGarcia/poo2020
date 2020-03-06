package polimorfismo_automotriz;

public class EmpVendedor extends Empleado{
    protected double sueld_min;
    protected int cant_vent;

    public double getSueld_min() {
        return sueld_min;
    }

    public void setSueld_min(double sueld_min) {
        this.sueld_min = sueld_min;
    }

    public int getCant_vent() {
        return cant_vent;
    }

    public void setCant_vent(int cant_vent) {
        this.cant_vent = cant_vent;
    }

    @Override
    public void calcularSueldo() {
        sueldo = sueld_min+(cant_vent*0.02);
    }

    public EmpVendedor(String rfc, String nombre, String departamento, String puesto, double sueld_min, int cant_vent){
        this.rfc = rfc;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.sueld_min = sueld_min;
        this.cant_vent = cant_vent;
    }
}
