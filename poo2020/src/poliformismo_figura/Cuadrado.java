package poliformismo_figura;

public class Cuadrado extends Figura {
    private double ladoCua;

    public double getLadoCua() {
        return ladoCua;
    }

    public void setLadoCua(double ladoCua) {
        this.ladoCua = ladoCua;
    }

    /**
     * Metodo Abstracto
     **/
    @Override
    public void calcularArea() {
        area = Math.pow(ladoCua,2);
    }

    /**
     * Metodo Constructor
     * @param nombre
     * @param ladoCua
     */
    public Cuadrado(String nombre, double ladoCua){
        this.nombre = nombre;
        this.ladoCua = ladoCua;
    }


}
