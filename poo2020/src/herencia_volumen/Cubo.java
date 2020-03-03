package herencia_volumen;

public class Cubo extends Figura {
    private double ladoCua;
    private double volCua;


    public double getLadoCua() {
        return ladoCua;
    }

    public void setLadoCua(double ladoCua) {
        this.ladoCua = ladoCua;
    }

    public double getVolCua() {
        return volCua;
    }

    public void setVolCua(double volCua) {
        this.volCua = volCua;
    }

    public double calcularVolCua(){
        volCua = Math.pow(ladoCua,3);
        return volCua;
    }

    public void presentar(){
        System.out.println("Volumen del cubo: "+ calcularVolCua());
    }

    public Cubo(double ladoCua){
        this.ladoCua = ladoCua;
    }
}
