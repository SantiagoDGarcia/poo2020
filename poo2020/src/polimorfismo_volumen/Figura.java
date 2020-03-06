package polimorfismo_volumen;

public abstract class Figura {
    protected String nombre;
    protected double vol;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getVol() {
        return vol;
    }

    public void setVol(double vol) {
        this.vol = vol;
    }

    public abstract void calcularVol();
}
