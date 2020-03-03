package herencia_volumen;

public class Cilindro extends Figura {
    private double altCil;
    private double radioCil;
    private double volCil;


    public double getAltCil() {
        return altCil;
    }

    public void setAltCil(double altCil) {
        this.altCil = altCil;
    }

    public double getRadioCil() {
        return radioCil;
    }

    public void setRadioCil(double radioCil) {
        this.radioCil = radioCil;
    }

    public double getVolCil() {
        return volCil;
    }

    public void setVolCil(double volCil) {
        this.volCil = volCil;
    }

    public double calcularVolCilindro(){
        volCil = (3.1416 * Math.pow(radioCil,2)* altCil);
        return volCil;
    }

    public void presentar(){
        System.out.println("Volumen del Cilindro: "+ calcularVolCilindro());
    }

    public Cilindro(double radioCil, double altCil){
        this.radioCil = radioCil;
        this.altCil= altCil;
    }
}
