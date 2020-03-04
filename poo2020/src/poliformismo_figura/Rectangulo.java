package poliformismo_figura;

public class Rectangulo extends Figura {
    private double baseRec;
    private double altRec;

    public double getBaseRec() {
        return baseRec;
    }

    public void setBaseRec(double baseRec) {
        this.baseRec = baseRec;
    }

    public double getAltRec() {
        return altRec;
    }

    public void setAltRec(double altRec) {
        this.altRec = altRec;
    }
    /**
     * Metodo Abstracto
     **/
    @Override
    public void calcularArea() {
        area = (baseRec * altRec);
    }

    /**
     * Metodo Constructor
     * @param nombre
     * @param baseRec
     * @param altRec
     */
    public Rectangulo(String nombre, double baseRec, double altRec){
        this.nombre = nombre;
        this.baseRec = baseRec;
        this.altRec = altRec;
    }
}
