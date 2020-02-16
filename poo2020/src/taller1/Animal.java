package taller1;

public class Animal {
    //definicion de atributos globales
    private Double tamaño;
    private Double peso;
    private String clasificacion;
    private String alimentacion;
    private String habitat;
    /**
     * Metodo para obtener el valor de la variable tamaño
     * @return this.tamaño
     */
    public Double obtener_tamaño(){
        return this.tamaño;
    }
    /**
     * Metodo para obtener el valor de la variable peso
     * @return this.peso
     */
    public Double obtener_peso(){
        return this.peso;
    }

    /**
     * Metodo para obtener la cadena de la variable clasificacion
     * @return this.clasificacion
     */
    public String obtener_clasificacion(){
        return  this.clasificacion;
    }

    /**
     * Metodo para obtener la cadena de la variable alimentacion
     * @return this.alimentacion
     */
    public String obtener_alimentacion(){
        return  this.alimentacion;
    }

    /**
     * Metodo para obtener la cadena de la variable habitat
     * @return this.habitat
     */
    public String obtener_habitat(){
        return  this.habitat;
    }

    /**
     * Metodo para actualizar el valor de la variable tamaño
     * @param tamaño
     */
    public void actualizar_tamaño(Double tamaño){
        // Con el this hacemos referencia a variables globales
        this.tamaño = tamaño;
    }

    /**
     * Metodo para actualizar el valor de la variable peso
     * @param peso
     */
    public void actualizar_peso(Double peso){
        // Con el this hacemos referencia a variables globales
        this.peso = peso;
    }

    /**
     * Metodo para actualizar la cadena de la variable clasificacion
     * @param clasificacion
     */
    public void actualizar_clasificacion(String clasificacion){
        this.clasificacion = clasificacion;
    }

    /**
     * Metodo para actualizar la cadena de la variable alimentacion
     * @param alimentacion
     */
    public void actualizar_alimentacion(String alimentacion){
        this.alimentacion = alimentacion;
    }

    /**
     * Metodo para actualizar la cadena de la variable habitat
     * @param habitat
     */
    public void actualizar_habitat(String habitat){
        this.habitat = habitat;
    }
}
