package diseino_seleccion;
import java.util.Scanner;
public class EjecutarDia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero del dia: ");
        int n_dia = teclado.nextInt();

        Dia dia = new Dia(n_dia);

        dia.presentar();

    }
}
