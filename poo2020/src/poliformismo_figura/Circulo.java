package poliformismo_figura;

public class Circulo extends Figura {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Metodo Abstracto
     **/
    @Override
    public void calcularArea() {
        area = 3.1416 * (Math.pow(radio,2));
    }

    /**
     * Metodo Constructor
     * @param nombre
     * @param radio
     */
    public Circulo(String nombre, double radio){
        this.nombre = nombre;
        this.radio = radio;
    }
}
