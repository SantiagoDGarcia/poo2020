package herencia_figura;

public class Circulo extends Figura {
    private double radio;
    private double areaCir;


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAreaCir() {
        return areaCir;
    }

    public void setAreaCir(double areaCir) {
        this.areaCir = areaCir;
    }

    public double calcularAreaCir(){
        areaCir = 3.1416 * (Math.pow(radio,2));
        return areaCir;
    }

    public void presentar(){
        System.out.println("Area del circulo: "+calcularAreaCir());
    }

    public Circulo(String nombre, double radio){
        this.nombre = nombre;
        this.radio = radio;
    }
}
