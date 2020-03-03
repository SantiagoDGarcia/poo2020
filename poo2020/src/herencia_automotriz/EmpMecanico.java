package herencia_automotriz;

public class EmpMecanico extends Empleado {
    private int trabajo;


    public Double calcular_sueldo(double trabajo){
        double sueldo = trabajo*0.04;
        return sueldo;
    }

    public void presentar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Cargo:  "+cargo);
        System.out.println("Dependencia:  "+dependencia);
        System.out.println("RFC:  S"+rfc);
        System.out.println("Sueldo:  "+calcular_sueldo(trabajo));
    }

    public EmpMecanico(String rfc, String nombre, String cargo, String dependencia, int trabajo){
        this.nombre = nombre;
        this.cargo = cargo;
        this.rfc = rfc;
        this.dependencia = dependencia;
        this.trabajo = trabajo;
    }
}
