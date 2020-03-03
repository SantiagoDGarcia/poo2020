package herencia_volumen;

public class Cono extends Figura {
    private double altCono;
    private double radioCono;
    private double volCono;

    public double getAltCono() {
        return altCono;
    }

    public void setAltCono(double altCono) {
        this.altCono = altCono;
    }

    public double getRadioCono() {
        return radioCono;
    }

    public void setRadioCono(double radioCono) {
        this.radioCono = radioCono;
    }

    public double getVolCono() {
        return volCono;
    }

    public void setVolCono(double volCono) {
        this.volCono = volCono;
    }

    public double calcularVolCono(){
        volCono = (0.3333)*(3.1416 * Math.pow(radioCono,2)* altCono);
        return volCono;
    }

    public void presentar(){
        System.out.println("Volumen del Cono: "+ calcularVolCono());
    }

    public Cono(double radioCono, double altCono){
        this.radioCono = radioCono;
        this.altCono= altCono;
    }
}
