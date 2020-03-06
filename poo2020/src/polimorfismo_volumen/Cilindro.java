package polimorfismo_volumen;

public class Cilindro extends Figura {
    private double altCil;
    private double radioCil;


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


    @Override
    public void calcularVol() {
        vol = (3.1416 * Math.pow(radioCil,2)* altCil);
    }


    public Cilindro(double radioCil, double altCil){
        this.radioCil = radioCil;
        this.altCil= altCil;
    }
}
