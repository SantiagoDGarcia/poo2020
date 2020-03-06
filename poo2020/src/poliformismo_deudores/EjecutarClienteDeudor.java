package poliformismo_deudores;

import java.util.Scanner;

public class EjecutarClienteDeudor {
    /**
     * Metodo estatico de clase principal
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaracion de Variables
        String nombre;
        int numCliente = 0;
        int numCuenta, plazo;
        double  capital;
        String cadena = "";
        int opcion1;

        // Ciclo repetitivo
        do {
            System.out.println("Ingrese el tipo de prestamo al que desea calcular el interés total a pagar");
            System.out.println("1.Personal   2.Hipotecario   3.Automóvil   4.Salir/Presentar Nómina");
            System.out.println("¿De que tipo de prestamo desea obtener el interes total?");
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
                    System.out.println("Ingrese el capital prestado:");
                    capital = teclado.nextDouble();
                    System.out.println("Ingrese el plazo de inversion:");
                    plazo = teclado.nextInt();
                    System.out.println("_________________________________________________");

                    // Creacion del objeto
                    PrestamoPersonal prestamoPersonal = new PrestamoPersonal(numCliente, nombre,
                            numCuenta, capital, plazo);
                    // Calculo del interes con metodo abstracto
                    prestamoPersonal.calcularInteres();
                    // Acumulacion de cadenas de datos requeridos
                    cadena = String.format("%s%s          %s           %s          %s\n", cadena, numCliente, nombre,
                            numCuenta, prestamoPersonal.getInteres());
                    break;

                case 2:
                    numCliente = numCliente +1;
                    System.out.println("_________________________________________________");
                    System.out.println("Ingrese el Nombre del cliente:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el Número de la cuenta:");
                    numCuenta = teclado.nextInt();
                    System.out.println("Ingrese el capital prestado:");
                    capital = teclado.nextDouble();
                    System.out.println("Ingrese el plazo de inversion:");
                    plazo = teclado.nextInt();
                    System.out.println("_________________________________________________");

                    // Creacion del objeto
                    PrestamoHipotecario prestamoHipotecario = new PrestamoHipotecario(numCliente, nombre,
                            numCuenta, capital, plazo);
                    // Calculo del interes con metodo abstracto
                    prestamoHipotecario.calcularInteres();
                    // Acumulacion de cadenas de datos requeridos
                    cadena = String.format("%s%s          %s           %s          %s\n", cadena, numCliente, nombre,
                            numCuenta, prestamoHipotecario.getInteres());
                    break;

                case 3:
                    numCliente = numCliente +1;
                    System.out.println("_________________________________________________");
                    System.out.println("Ingrese el Nombre del cliente:");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el Número de la cuenta:");
                    numCuenta = teclado.nextInt();
                    System.out.println("Ingrese el capital prestado:");
                    capital = teclado.nextDouble();
                    System.out.println("Ingrese el plazo de inversion:");
                    plazo = teclado.nextInt();
                    System.out.println("_________________________________________________");

                    // Creacion del objeto
                    PrestamoAuto prestamoAuto = new PrestamoAuto(numCliente, nombre,
                            numCuenta, capital, plazo);
                    // Calculo del interes con metodo abstracto
                    prestamoAuto.calcularInteres();
                    // Acumulacion de cadenas de datos requeridos
                    cadena = String.format("%s%s          %s           %s          %s\n", cadena, numCliente, nombre,
                            numCuenta, prestamoAuto.getInteres());
                    break;


                case 4:
                    System.out.println("  ---------------REPORTE DE NOMINA QUINCENAL---------------\n" +
                            "No.Cliente      Nombre           No.Cuenta          Interés Ganado\n" +
                            "____________________________________________________________________\n");
                    System.out.println(cadena);
                    System.out.println("TOTAL: "+numCliente+" CLIENTES");
            }

        }while (opcion1 != 4);
    }
}
