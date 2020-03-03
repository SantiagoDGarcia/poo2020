package herencia_figura;

public class Cuadrado extends Figura {
    private double ladoCua;
    private double areaCua;


    public double getLadoCua() {
        return ladoCua;
    }

    public void setLadoCua(double ladoCua) {
        this.ladoCua = ladoCua;
    }

    public double calcularAreaCua(){
        areaCua = Math.pow(ladoCua,2);
        return areaCua;
    }

    public void presentar(){
        System.out.println("Area del cuadrado: "+ calcularAreaCua());
    }

    public Cuadrado(String nombre, double ladoCua){
        this.nombre = nombre;
        this.ladoCua = ladoCua;
    }


}
