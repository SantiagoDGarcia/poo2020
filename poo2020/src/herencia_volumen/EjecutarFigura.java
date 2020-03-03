package herencia_volumen;

import herencia_figura.Rectangulo;

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
                    cubo.presentar();
                    break;

                case 2:
                    System.out.println("Ingrese el radio:");
                    radio = teclado.nextDouble();
                    System.out.println("Ingrese la altura:");
                    altura = teclado.nextDouble();

                    Cilindro cilindro = new Cilindro(radio, altura);
                    cilindro.presentar();
                    break;

                case 3:
                    System.out.println("Ingrese el radio:");
                    radio = teclado.nextDouble();
                    System.out.println("Ingrese la altura:");
                    altura = teclado.nextDouble();

                    Cono cono = new Cono(radio,altura);
                    cono.presentar();
                    break;

                case 4:
                    System.out.println("Ingrese el radio:");
                    radio = teclado.nextDouble();

                    Esfera esfera = new Esfera(radio);
                    esfera.presentar();
                    break;
            }

        }while(opcion1 != 5);

    }
}
