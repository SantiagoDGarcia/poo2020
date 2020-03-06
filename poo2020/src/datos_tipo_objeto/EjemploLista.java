package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;

public class EjemploLista {
    public static void main(String[] args) {
        // Creacion de una lista en java, para almacenar valores cadena
        List <String> universidades = new ArrayList<String>();
        universidades.add("UTPL");
        System.out.println("Tamaño lista: "+universidades.size());
        universidades.add("ESPOL");
        System.out.println("Tamaño lista: "+universidades.size());
        universidades.add("UNL");
        System.out.println("Tamaño lista: "+universidades.size());
        // Eliminacion elemento posicion 1
        universidades.remove(1);
        System.out.println("Tamaño lista luego de usar remove: "+universidades.size());
        // Remplazando un elemento de la lista
        universidades.set(1,"UIDE");

        // For para recorrer la lista
        System.out.println("FOR normal");
        for(int i = 0; i < universidades.size();i++){
            System.out.println(universidades.get(i));
        }
        // agregar un valor en una posicion intermedia
        universidades.add(1,"UNL");

        System.out.println("FOR EACH");
        //Uso de For Each
        for(String foreach : universidades){
            System.out.println(foreach);
        }



    }
}
