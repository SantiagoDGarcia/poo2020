package herencia_automotriz;

public class EmpAdmvo extends Empleado {
    private Double sueldo_mensual;


    public Double getSueldo_mensual() {
        return sueldo_mensual;
    }

    public void setSueldo_mensual(Double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    public Double calcular_sueldo(double sueldo_mensual){
        double sueldo = sueldo_mensual/2;
        return sueldo;
    }

    public void presentar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Cargo:  "+cargo);
        System.out.println("Dependencia:  "+dependencia);
        System.out.println("RFC:  "+rfc);
        System.out.println("Sueldo:  "+calcular_sueldo(sueldo_mensual));
    }

    public EmpAdmvo( String rfc, String nombre, String cargo, String dependencia,double sueldo_mensual){
        this.nombre = nombre;
        this.cargo = cargo;
        this.rfc = rfc;
        this.dependencia = dependencia;
        this.sueldo_mensual = sueldo_mensual;
    }
}
