package arreglosdeberpoo;
import java.util.Scanner;

public class EjecutarConvertidor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el número binario de 6 cifras");
        int numero = teclado.nextInt();

        Convertidor convertidor = new Convertidor(numero);
        convertidor.presentar();
    }

}
