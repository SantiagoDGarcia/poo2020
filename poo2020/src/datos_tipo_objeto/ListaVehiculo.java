package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehiculo {
    public static void main(String[] args) {
        // Creacion de una lista en java, para almacenar valores cadena
        // Se almacena valores de tipo vehiculo
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        Scanner teclado = new Scanner(System.in);
        String placa,  marca,  modelo, color;
        int anio, cilind;
        boolean bandera = true;
        int opcion = 1;

        do {
            System.out.println("___________________________");
            System.out.println("SISTEMA INGRESO DE DATOS VEHICULO");
            System.out.println("___________________________");
            System.out.println("1. Añadir Vehiculo");
            System.out.println("2. Presentar Vehiculos");
            System.out.println("3. Salir del Programa");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:

                    int cont = 0;
                    System.out.println("___________________________");
                    System.out.println("Ingrese la Placa del Vehiculo");
                    placa = teclado.nextLine();
                    System.out.println("Ingrese la Marca del Vehiculo");
                    marca = teclado.nextLine();
                    System.out.println("Ingrese el Año del Vehiculo");
                    anio = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese el Modelo del Vehiculo");
                    modelo = teclado.nextLine();
                    System.out.println("Ingrese el Color del Vehiculo");
                    color = teclado.nextLine();
                    System.out.println("Ingrese el cilindraje del Vehiculo");
                    cilind = teclado.nextInt();

                    // Creacion del Objeto
                    Vehiculo vehiculo = new Vehiculo(placa, marca, anio, modelo, color, cilind);
                    // Se añade a la lista
                    vehiculos.add(vehiculo);
                    break;

                case 2:
                    System.out.println("___________________________");
                    System.out.println("Lista de vehiculos:");
                    // For para imprimir la lista
                    for(Vehiculo listVeh: vehiculos){
                        //System.out.println(listVeh);
                        System.out.println("___________________________");
                        System.out.println("Placa: "+listVeh.getPlaca());
                        System.out.println("Marca: "+listVeh.getMarca());
                        System.out.println("Año: "+listVeh.getAnio());
                        System.out.println("Modelo: "+listVeh.getModelo());
                        System.out.println("Color: "+listVeh.getColor());
                        System.out.println("Cilindraje: "+listVeh.getCilind());
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
