package diseniopoo;

public class Estudiante {
    private String nomb;
    private int nro_cedula;
    private Double nota_1_bim;
    private Double nota_2_bim;

    public Estudiante(int nro_cedula, String nomb, double nota_1_bim ,double nota_2_bim){
        this.nro_cedula = nro_cedula;
        this.nomb = nomb;
        this.nota_1_bim = nota_1_bim;
        this.nota_2_bim = nota_2_bim;
    }

    public String calcular_prom(double nota_1_bim, double nota_2_bim){
        double promFinal = (nota_1_bim+nota_2_bim);
        String text_prom;
        if (promFinal >= 28){
            text_prom = "Aprobado";
        } else{
            text_prom = "Examen Final";
        }
        return text_prom;
    }

    public void presentar(){
        System.out.println(" __________________________________________________________");
        System.out.println("|ESTUDIANTE:     "+nomb );
        System.out.println("|CÉDULA:        "+nro_cedula );
        System.out.println("|ESTADO ACADÉMICO:      "+ calcular_prom(nota_1_bim,nota_2_bim));
        System.out.println(" ___________________________________________________________");
    }
    public String getNomb() {
        return nomb;
    }

    public void setNombre(String nomb) {
        this.nomb = nomb;
    }

    public int getNro_cedula() {
        return nro_cedula;
    }

    public void setNro_cedula(int nro_cedula) {
        this.nro_cedula = nro_cedula;
    }

    public Double getNota_1_bim() {
        return nota_1_bim;
    }

    public void setNota_1_bim(Double nota_1_bim) {
        this.nota_1_bim = nota_1_bim;
    }

    public Double getNota_2_bim() {
        return nota_2_bim;
    }

    public void setNota_2_bim(Double nota_2_bim) {
        this.nota_2_bim = nota_2_bim;
    }


}
