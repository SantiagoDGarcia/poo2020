package herencia_figura;

public class Rectangulo extends Figura {
    private double baseRec;
    private double altRec;
    private double areaRec;


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

    public double getAreaRec() {
        return areaRec;
    }

    public void setAreaRec(double areaRec) {
        this.areaRec = areaRec;
    }

    public double calcularAreaRec(){
        areaRec = (baseRec * altRec);
        return areaRec;
    }

    public void presentar(){
        System.out.println("Area del rectangulo: "+ calcularAreaRec());
    }

    public Rectangulo(String nombre, double baseRec, double altRec){
        this.nombre = nombre;
        this.baseRec = baseRec;
        this.altRec = altRec;
    }
}
