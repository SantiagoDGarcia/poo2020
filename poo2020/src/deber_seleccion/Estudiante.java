package deber_seleccion;

public class Estudiante {
    private String nombreAlum;
    private Double calif1;
    private Double calif2;
    private Double calif3;
    private Double calif4;
    private Double promedio;
    private String observacion;

    public Estudiante(String nombreAlum, double calif1 ,double calif2, double calif3 , double calif4){
        this.nombreAlum = nombreAlum;
        this.calif1 = calif1;
        this.calif2 = calif2;
        this.calif3 = calif3;
        this.calif4 = calif4;
    }

    public Double calcularProm(double calif1, double calif2, double calif3, double calif4){
        promedio = (calif1+calif2+calif3+calif4)/4;
        return promedio;
    }
    public String calcularObservacion(Double promedio, String observacion){
        if (promedio >= 60){
            observacion = "Aprobado";
        } else{
            observacion = "Reprobado";
        }
        return observacion;
    }

    public void presentar(){
        System.out.println(" __________________________________________________________");
        System.out.println("|ESTUDIANTE:     "+nombreAlum );
        System.out.println("|PROMEDIO:     "+calcularProm(calif1,calif2,calif3,calif4));
        System.out.println("|ESTADO ACADÉMICO:      "+ calcularObservacion(promedio, observacion));
        System.out.println(" ___________________________________________________________");
    }

    public String getNombreAlum() {
        return nombreAlum;
    }

    public void setNombreAlum(String nombreAlum) {
        this.nombreAlum = nombreAlum;
    }

    public Double getCalif1() {
        return calif1;
    }

    public void setCalif1(Double calif1) {
        this.calif1 = calif1;
    }

    public Double getCalif2() {
        return calif2;
    }

    public void setCalif2(Double calif2) {
        this.calif2 = calif2;
    }

    public Double getCalif3() {
        return calif3;
    }

    public void setCalif3(Double calif3) {
        this.calif3 = calif3;
    }

    public Double getCalif4() {
        return calif4;
    }

    public void setCalif4(Double calif4) {
        this.calif4 = calif4;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
