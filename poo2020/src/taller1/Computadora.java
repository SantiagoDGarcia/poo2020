package taller1;

public class Computadora {
    //definicion de atributos globales
    private Double tamaño;
    private String sys_op;
    private String procesador;
    private String tar_video;
    private String almacenamiento;
    private String ram;
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
     * Metodo para obtener la cadena de la variable procesador
     * @return this.procesador
     */
    public String obtener_procesador(){
        return  this.procesador;
    }

    /**
     * Metodo para obtener la cadena de la variable tarjeta de video
     * @return this.tar_video
     */
    public String obtener_tar_video(){
        return  this.tar_video;
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
    public String obtener_ram(){
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
     * Metodo para actualizar la cadena de la variable procesador
     * @param procesador
     */
    public void actualizar_procesador(String procesador){
        this.procesador = procesador;
    }

    /**
     * Metodo para actualizar la cadena de la variable tarjeta de video
     * @param tar_video
     */
    public void actualizar_tar_video(String tar_video){
        this.tar_video = tar_video;
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
    public void actualizar_ram(String ram){
        this.ram = ram;
    }

}
