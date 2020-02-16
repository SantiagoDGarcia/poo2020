package disenio_repeticion;

public class Empleado {
    private String nombre;
    private Double numero_horas;
    private  Double cuota_hora;
    private Double sueldo;

    // Constructor de objeto
    public Empleado( String nombre, double numero_horas, double cuota_hora){
        this.nombre = nombre;
        this.numero_horas = numero_horas;
        this.cuota_hora = cuota_hora;
    }

    public Double calcular_sueldo(double numero_horas, double cuota_hora){

        if (numero_horas <= 40){
            sueldo =  numero_horas * cuota_hora;
        } else{
            if (numero_horas <= 50){
                sueldo = (40*cuota_hora) + (numero_horas-40) * (cuota_hora*2);
            }
        }
        return sueldo;
    }
    public void presentar(){
        System.out.println(" __________________________________________________________");
        System.out.println("|EMPLEADO:     "+nombre );
        System.out.println("|SUELDO:      "+calcular_sueldo(numero_horas, cuota_hora));
        System.out.println(" ___________________________________________________________");
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
