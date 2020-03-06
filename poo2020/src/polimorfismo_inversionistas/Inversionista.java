package polimorfismo_inversionistas;

/**
 * Clase Abstracta
 */
public abstract class Inversionista {
    protected int numCliente;
    protected String nomCliente;
    protected int numCuenta;
    protected double capInvert;
    protected int plazInver;
    protected double interes;

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getCapInvert() {
        return capInvert;
    }

    public void setCapInvert(double capInvert) {
        this.capInvert = capInvert;
    }

    public int getPlazInver() {
        return plazInver;
    }

    public void setPlazInver(int plazInver) {
        this.plazInver = plazInver;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    // Metodo Abstracto
    public abstract void calcularInteres();
}
