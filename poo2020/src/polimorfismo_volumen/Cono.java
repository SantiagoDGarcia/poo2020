package polimorfismo_volumen;

public class Cono extends Figura {
    private double altCono;
    private double radioCono;

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


    @Override
    public void calcularVol() {
        vol = (0.3333)*(3.1416 * Math.pow(radioCono,2)* altCono);
    }

    public Cono(double radioCono, double altCono){
        this.radioCono = radioCono;
        this.altCono= altCono;
    }
}
