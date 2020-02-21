package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutarDatosPersona {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nombre = new String[5];
        String[]  univer = new String[5];
        int[] edad = new int[5];
        int[]  celular = new int [5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre: ");
            nombre[i] = teclado.nextLine();
            System.out.println("Ingrese la edad de " + nombre[i]);
            edad[i] = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Ingrese la universidad en la cual estudia " + nombre[i]);
            univer[i] = teclado.nextLine();
            System.out.println("Ingrese numero celular  de " + nombre[i]);
            celular[i] = teclado.nextInt();
            teclado.nextLine();
        }

        DatosPersona datosPersona = new DatosPersona(nombre,edad,univer,celular);
        datosPersona.presentar();

    }
}
