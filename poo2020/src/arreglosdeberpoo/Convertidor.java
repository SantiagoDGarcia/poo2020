package arreglosdeberpoo;

public class Convertidor{
    private int numero;
    private int[] conversion = new int[6];

    public Convertidor(int numero) {
        this.numero = numero;
    }

    public int transformarDecimal(){

        int count = 5;
        for (int i = 0; i < 6 ; i++) {
            getConversion()[count] = (int)((getNumero() /Math.pow(10,i))%10);
            count--;
        }
        int suma = 0;
        count = 5;
        for (int i = 0; i < 6; i++) {
            suma += (getConversion()[i] * Math.pow(2, count));
            count--;
        }
        return suma;
    }

    public void presentar() {

        System.out.println(" __________________________________________________________");
        System.out.println("|NUMERO DECIMAL:  " +transformarDecimal());
        System.out.println(" __________________________________________________________");

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int[] getConversion() {
        return conversion;
    }

    public void setConversion(int[] conversion) {
        this.conversion = conversion;
    }
}



