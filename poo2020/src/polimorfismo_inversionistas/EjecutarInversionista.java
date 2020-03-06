package polimorfismo_inversionistas;

import java.util.Scanner;

public class EjecutarInversionista {
    /**
     * Metodo estatico de clase principal
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaracion de Variables
        String nombre;
        int numCliente = 0;
        int numCuenta, plazInver;
        double  capInvert;
        String cadena = "";
        int opcion1;

        // Ciclo repetitivo
        do {
            System.out.println("Ingrese el tipo de cuenta al que desea calcular el interes");
            System.out.println("1.Ahorros   2.Mecánico   3.Vendedor   4.Salir/presentar nómina");
            System.out.println("¿De que tipo de cuenta desea obtener el interes?");
            opcion1 = teclado.nextInt();

            teclado.nextLine();
            switch (opcion1) {
                case 1:
                    numCliente = numCliente +1;
                    System.out.println("_________________________________________________");
                    System.out.println("Ingrese el Nombre del cliente:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el Número de la cuenta:");
                    numCuenta = teclado.nextInt();
                    System.out.println("Ingrese el capital invertido:");
                    capInvert = teclado.nextDouble();
                    System.out.println("Ingrese el plazo de inversion:");
                    plazInver = teclado.nextInt();
                    System.out.println("_________________________________________________");

                    // Creacion del objeto
                    CuentaAhorro cuentaAhorro = new CuentaAhorro(numCliente, nombre, numCuenta, capInvert, plazInver);
                    // Calculo del interes con metodo abstracto
                    cuentaAhorro.calcularInteres();
                    // Acumulacion de cadenas de datos requeridos
                    cadena = String.format("%s%s      %s       %s      %s\n", cadena, numCliente, nombre,
                            numCuenta, cuentaAhorro.getInteres());
                    break;

                case 2:
                    numCliente = numCliente +1;
                    System.out.println("_________________________________________________");
                    System.out.println("Ingrese el Nombre del cliente:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el Número de la cuenta:");
                    numCuenta = teclado.nextInt();
                    System.out.println("Ingrese el capital invertido:");
                    capInvert = teclado.nextDouble();
                    System.out.println("Ingrese el plazo de inversion:");
                    plazInver = teclado.nextInt();
                    System.out.println("_________________________________________________");

                    // Creacion del objeto
                    Pagare pagare = new Pagare(numCliente, nombre, numCuenta, capInvert, plazInver);
                    // Calculo del interes con metodo abstracto
                    pagare.calcularInteres();
                    // Acumulacion de cadenas de datos requeridos
                    cadena = String.format("%s%s      %s       %s       %s\n", cadena, numCliente, nombre,
                            numCuenta, pagare.getInteres());
                    break;

                case 3:
                    numCliente = numCliente +1;
                    System.out.println("_________________________________________________");
                    System.out.println("Ingrese el Nombre del cliente:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el Número de la cuenta:");
                    numCuenta = teclado.nextInt();
                    System.out.println("Ingrese el capital invertido:");
                    capInvert = teclado.nextDouble();
                    System.out.println("Ingrese el plazo de inversion:");
                    plazInver = teclado.nextInt();
                    System.out.println("_________________________________________________");


                    // Creacion del objeto
                    CuentaMaestra cuentaMaestra = new CuentaMaestra(numCliente, nombre, numCuenta, capInvert, plazInver);
                    // Calculo del interes con metodo abstracto
                    cuentaMaestra.calcularInteres();
                    // Acumulacion de cadenas de datos requeridos
                    cadena = String.format("%s%s         %s          %s        %s\n", cadena, numCliente, nombre,
                            numCuenta, cuentaMaestra.getInteres());
                    break;
                case 4:
                    System.out.println("  ---------------REPORTE DE NOMINA QUINCENAL---------------\n" +
                            "No.Cliente    Nombre       No.Cuenta       Interés Ganado\n" +
                            "____________________________________________________________________\n");
                    System.out.println(cadena);
                    System.out.println("TOTAL: "+numCliente+" CLIENTES");

            }

        }while (opcion1 != 4);
    }
}
