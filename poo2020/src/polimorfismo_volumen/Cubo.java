package polimorfismo_volumen;

public class Cubo extends Figura {
    private double ladoCua;

    public double getLadoCua() {
        return ladoCua;
    }

    public void setLadoCua(double ladoCua) {
        this.ladoCua = ladoCua;
    }


    @Override
    public void calcularVol() {
        vol = Math.pow(ladoCua,3);
    }

    public Cubo(double ladoCua){
        this.ladoCua = ladoCua;
    }
}
