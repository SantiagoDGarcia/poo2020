package poliformismo_figura;
import java.util.Scanner;

public class EjecutarFigura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variables
        String nombre;
        double baseTri, altTri;
        double lado;
        double baseRec, altRec;
        double radio;
        int opcion1;

        do {
            System.out.println("Ingrese una de las siguientes figura, circulo, triangulo, rectangulo, cuadrado");
            System.out.println("1.Triangulo   2.Cuadrado   3.Rectangulo   4.Circulo   5. salir");
            System.out.println("¿El area de que figura desea calcular?");
            opcion1 = teclado.nextInt();

            switch (opcion1) {
                case 1:
                    String opcion = "Triangulo";
                    System.out.println("Ingrese la base:");
                    baseTri = teclado.nextDouble();
                    System.out.println("Ingrese la altura:");
                    altTri = teclado.nextDouble();

                    Triangulo triangulo = new Triangulo(opcion, baseTri, altTri);

                    triangulo.calcularArea();
                    System.out.println("Area del triangulo: "+triangulo.getArea());

                    break;

                case 2:
                    opcion = "Cuadrado";
                    System.out.println("Ingrese el lado:");
                    lado = teclado.nextDouble();

                    Cuadrado cuadrado = new Cuadrado(opcion, lado);

                    cuadrado.calcularArea();
                    System.out.println("Area del cuadrado: "+ cuadrado.getArea());
                    break;

                case 3:
                    opcion = "Rectangulo";
                    System.out.println("Ingrese la base:");
                    baseRec = teclado.nextDouble();
                    System.out.println("Ingrese la altura:");
                    altRec = teclado.nextDouble();

                    Rectangulo rectangulo = new Rectangulo(opcion, baseRec, altRec);
                    rectangulo.calcularArea();
                    System.out.println("Area del rectangulo: "+ rectangulo.getArea());
                    break;

                case 4:
                    opcion = "Circulo";
                    System.out.println("Ingrese el radio:");
                    radio = teclado.nextDouble();

                    Circulo circulo = new Circulo(opcion, radio);
                    circulo.calcularArea();

                    System.out.println("Area del circulo: "+circulo.getArea());
                    break;

            }

        }while(opcion1 != 5);

    }
}
