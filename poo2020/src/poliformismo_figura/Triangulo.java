package poliformismo_figura;

public  class Triangulo extends Figura {
    private double baseTri;
    private double altTri;

    public double getBaseTri() {
        return baseTri;
    }

    public void setBaseTri(double baseTri) {
        this.baseTri = baseTri;
    }

    public double getAltTri() {
        return altTri;
    }

    public void setAltTri(double altTri) {
        this.altTri = altTri;
    }

    /**
     * Metodo Abstracto
     **/
    @Override
    public void calcularArea() {
        area = (baseTri * altTri)/2;
    }

    /**
     * Metodo Constructor
     * @param nombre
     * @param baseTri
     * @param altTri
     */
    public Triangulo(String nombre, double baseTri, double altTri){
        this.nombre = nombre;
        this.baseTri = baseTri;
        this.altTri = altTri;
    }

}
