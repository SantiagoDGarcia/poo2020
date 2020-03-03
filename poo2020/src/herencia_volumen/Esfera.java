package herencia_volumen;

public class Esfera extends Figura {
    private double radioEsf;
    private double volEsf;


    public double getRadioEsf() {
        return radioEsf;
    }

    public void setRadioEsf(double radioEsf) {
        this.radioEsf = radioEsf;
    }

    public double getVolEsf() {
        return volEsf;
    }

    public void setVolEsf(double volEsf) {
        this.volEsf = volEsf;
    }

    public double calcularVolEsf(){
        volEsf = (1.3333)* 3.1416 * Math.pow(radioEsf,3);
        return volEsf;
    }

    public void presentar(){
        System.out.println("Volumen de la esfera: "+ calcularVolEsf());
    }

    public Esfera(double radioEsf){
        this.radioEsf = radioEsf;
    }
}
