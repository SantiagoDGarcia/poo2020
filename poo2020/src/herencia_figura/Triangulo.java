package herencia_figura;

public class Triangulo extends Figura {
    private double baseTri;
    private double altTri;
    private double areaTri;

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

    public double getAreaTri() {
        return areaTri;
    }

    public void setAreaTri(double areaTri) {
        this.areaTri = areaTri;
    }

    public double calcularAreaT(){
        areaTri = (baseTri * altTri)/2;
        return areaTri;
    }

    public void presentar(){
        System.out.println("Area del triangulo: "+ calcularAreaT());
    }

    public Triangulo(String nombre, double baseTri, double altTri){
        this.nombre = nombre;
        this.baseTri = baseTri;
        this.altTri = altTri;
    }
}
