package polimorfismo_inversionistas;

public class Pagare extends Inversionista{

    /**
     * Metodo abstracto de la clase inversionista
     */
    @Override
    public void calcularInteres() {
        interes = capInvert * (0.20 * plazInver);
    }

    /**
     * Metodo Constructor
     * @param numCliente
     * @param nombCliente
     * @param numCuenta
     * @param capInvert
     * @param plazInver
     */
    public Pagare(int numCliente, String nombCliente, int numCuenta, double capInvert, int plazInver){
        this.numCliente = numCliente;
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.capInvert = capInvert;
        this.plazInver = plazInver;
    }
}
