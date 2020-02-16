package taller1;

public class Celular {
    //definicion de atributos globales
    private Double tamaño;
    private String sys_op;
    private String marca;
    private String color;
    private String almacenamiento;
    private int ram;
    /**
     * Metodo para obtener el valor de la variable tamaño
     * @return this.tamaño
     */
    public Double obtener_tamaño(){
        return this.tamaño;
    }
    /**
     * Metodo para obtener el valor de la variable sys_op
     * @return this.sys_op
     */
    public String obtener_sys_op(){
        return  this.sys_op;
    }

    /**
     * Metodo para obtener la cadena de la variable marca
     * @return this.marca
     */
    public String obtener_marca(){
        return  this.marca;
    }

    /**
     * Metodo para obtener la cadena de la variable color
     * @return this.color
     */
    public String obtener_color(){
        return  this.color;
    }

    /**
     * Metodo para obtener la cadena de la variable almacenamiento
     * @return this.almacenamiento
     */
    public String obtener_almacenamiento(){
        return  this.almacenamiento;
    }


    /**
     * Metodo para obtener la cadena de la variable ram
     * @return this.ram
     */
    public int obtener_ram(){
        return  this.ram;
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
     * Metodo para actualizar la cadena de la variable sistema operativo
     * @param sys_op
     */
    public void actualizar_sys_op(String sys_op){
        this.sys_op = sys_op;
    }
    /**
     * Metodo para actualizar la cadena de la variable marca
     * @param marca
     */
    public void actualizar_marca(String marca){
        this.marca = marca;
    }

    /**
     * Metodo para actualizar la cadena de la variable color
     * @param color
     */
    public void actualizar_tar_video(String color){
        this.color = color;
    }

    /**
     * Metodo para actualizar la cadena de la variable almacenamiento
     * @param almacenamiento
     */
    public void actualizar_almacenamiento(String almacenamiento){
        this.almacenamiento = almacenamiento;
    }

    /**
     * Metodo para actualizar la cadena de la variable ram
     * @param ram
     */
    public void actualizar_ram(int ram){
        this.ram = ram;
    }
}
