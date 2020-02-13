package diseniopoo;
import java.util.Scanner;

public class EjecutarCerveza {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre de la Cerveza: ");
        String nombre = teclado.nextLine();
        System.out.println("Tipo de Cerveza: ");
        String tipo = teclado.nextLine();
        System.out.println("Ingrese Costo: ");
        double precio = teclado.nextDouble();
        System.out.println("Numero Unidades Vendidas: ");
        int unidades = teclado.nextInt();

        Cerveza cerveza = new Cerveza(unidades, precio,tipo,nombre);
        cerveza.ficha();


        //cerveza.ficha();

    }
}
