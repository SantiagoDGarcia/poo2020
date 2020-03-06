package datos_tipo_objeto;

import herencia_figura.Triangulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nombre {
    public static void main(String[] args) {
        // Creacion de una lista en java, para almacenar valores cadena
        List<String> nombres = new ArrayList<String>();

        Scanner teclado = new Scanner(System.in);
        boolean bandera = true;
        int opcion = 1;

        do {
            System.out.println("___________________________");
            System.out.println("INGRESO DE DATOS");
            System.out.println("___________________________");
            System.out.println("1. Añadir Nombre");
            System.out.println("2. Presentar Nombres");
            System.out.println("3. Salir del Programa");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    int cont = 0;
                    System.out.println("___________________________");
                    System.out.println("Agregue un nombre");
                    nombres.add(teclado.nextLine());
                    break;

                case 2:
                    System.out.println("___________________________");
                    System.out.println("Lista de nombres:");
                    // For para imprimir la lista
                    for(int i = 0; i < nombres.size();i++){
                        System.out.println((i+1)+". "+nombres.get(i));
                    }
                    System.out.println("___________________________");
                    break;
                case 3:
                    System.out.println("___________________________");
                    System.out.println("Gracias. Fin del Programa");
                    System.out.println("___________________________");
                    bandera = false;
            }
        } while(bandera);

    }
}
