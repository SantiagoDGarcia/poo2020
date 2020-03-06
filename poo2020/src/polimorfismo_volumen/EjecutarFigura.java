package polimorfismo_volumen;

import java.util.Scanner;

public class EjecutarFigura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variables
        String nombre;
        double lado;
        double radio, altura;


        int opcion1;

        do {
            System.out.println("_______________________________________________________");
            System.out.println("Ingrese una de las siguientes figuras");
            System.out.println("1.Cubo   2.Cilindro   3.Cono   4.Esfera   5.Salir");
            System.out.println("¿El area de que figura desea calcular?");
            opcion1 = teclado.nextInt();

            switch (opcion1) {
                case 1:
                    System.out.println("Ingrese el lado:");
                    lado = teclado.nextDouble();

                    Cubo cubo = new Cubo(lado);
                    cubo.calcularVol();
                    System.out.println("Volumen del cubo: "+ cubo.getVol());
                    break;

                case 2:
                    System.out.println("Ingrese el radio:");
                    radio = teclado.nextDouble();
                    System.out.println("Ingrese la altura:");
                    altura = teclado.nextDouble();

                    Cilindro cilindro = new Cilindro(radio, altura);
                    cilindro.calcularVol();

                    System.out.println("Volumen del Cilindro: "+ cilindro.getVol());
                    break;

                case 3:
                    System.out.println("Ingrese el radio:");
                    radio = teclado.nextDouble();
                    System.out.println("Ingrese la altura:");
                    altura = teclado.nextDouble();

                    Cono cono = new Cono(radio,altura);
                    cono.calcularVol();

                    System.out.println("Volumen del Cono: "+ cono.getVol());
                    break;

                case 4:
                    System.out.println("Ingrese el radio:");
                    radio = teclado.nextDouble();

                    Esfera esfera = new Esfera(radio);
                    esfera.calcularVol();

                    System.out.println("Volumen de la esfera: "+ esfera.getVol());
                    break;
            }

        }while(opcion1 != 5);

    }
}
