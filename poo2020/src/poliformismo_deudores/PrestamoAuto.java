package poliformismo_deudores;

public class PrestamoAuto extends ClienteDeudor{

    /**
     * Metodo abstracto de la clase ClienteDeudor
     */
    @Override
    public void calcularInteres() {
        interes = (capital + ((capital * 0.1268) * plazo));
    }

    /**
     * Metodo Constructor
     * @param numCliente
     * @param nombCliente
     * @param numCuenta
     * @param capital
     * @param plazo
     */
    public PrestamoAuto(int numCliente, String nombCliente, int numCuenta, double capital, int plazo){
        this.numCliente = numCliente;
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.capital = capital;
        this.plazo = plazo;
    }
}
