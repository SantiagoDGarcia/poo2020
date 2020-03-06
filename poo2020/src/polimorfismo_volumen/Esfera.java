package polimorfismo_volumen;


public class Esfera extends Figura {
    private double radioEsf;


    public double getRadioEsf() {
        return radioEsf;
    }

    public void setRadioEsf(double radioEsf) {
        this.radioEsf = radioEsf;
    }


    @Override
    public void calcularVol() {
        vol = (1.3333)* 3.1416 * Math.pow(radioEsf,3);
    }


    public Esfera(double radioEsf){
        this.radioEsf = radioEsf;
    }
}
