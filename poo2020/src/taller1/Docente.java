package taller1;

public class Docente {
    //definicion de atributos globales
    private int edad;
    private int promedio;
    private int nro_cedula;
    private String nombre;
    private String gp_sanguineo;
    private String nv_academico;
    private String genero;
    private Double estatura;

    /**
     * Metodo para obtener el valor de la variable edad
     * @return this.edad
     */
    public int obtener_edad(){
        return  this.edad;
    }
    /**
     * Metodo para obtener el valor de la variable nro_cedula
     * @return this.nro_cedula
     */
    public int obtener_nro_cedula(){
        return  this.nro_cedula;
    }
    /**
     * Metodo para obtener el valor de la variable promedio
     * @return this.promedio
     */
    public int obtener_promedio(){
        return  this.promedio;
    }

    /**
     * Metodo para obtener la cadena de la variable nombre
     * @return this.nombre
     */
    public String obtener_nombre(){
        return  this.nombre;
    }

    /**
     * Metodo para obtener la cadena de la variable gp_sanguineo
     * @return this.gp_sanguineo
     */
    public String obtener_gp_sanguineo(){
        return  this.gp_sanguineo;
    }


    /**
     * Metodo para obtener la cadena de la variable nv_academico
     * @return this.nv_academico
     */
    public String obtener_nv_academico(){
        return  this.nv_academico;
    }

    /**
     * Metodo para obtener la cadena de la variable genero
     * @return this.genero
     */
    public String obtener_genero(){
        return this.genero;
    }

    public Double obtener_estatura(){
        return  this.estatura;
    }

    /**
     * Metodo para actualizar el valor de la variable edad
     * @param edad
     */
    public void actualizar_edad(int edad){
        // Con el this hacemos referencia a variables globales
        this.edad = edad;
    }

    /**
     * Metodo para actualizar el valor de la variable nro_cedula
     * @param nro_cedula
     */
    public void actualizar_nro_cedula(int nro_cedula){
        this.nro_cedula = nro_cedula;
    }
    /**
     * Metodo para actualizar el valor de la variable promedio
     * @param promedio
     */
    public void actualizar_promedio(int promedio){
        this.promedio = promedio;
    }

    /**
     * Metodo para actualizar la cadena de la variable nombre
     * @param nombre
     */
    public void actualizar_nombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Metodo para actualizar la cadena de la variable gp_sanguineo
     * @param gp_sanguineo
     */
    public void actualizar_gp_sanguineo(String gp_sanguineo){
        this.gp_sanguineo = gp_sanguineo;
    }

    /**
     * Metodo para actualizar la cadena de la variable nv_academico
     * @param nv_academico
     */
    public void actualizar_nv_academico(String nv_academico){
        this.nv_academico = nv_academico;
    }

    /**
     * Metodo para actualizar la cadena de la variable genero
     * @param genero
     */
    public void actualizar_genero(String genero){
        this.genero = genero;
    }

    /**
     * Metodo para actualizar el valor de la variable estatura
     * @param estatura
     */
    public void actualizar_estatura(Double estatura){
        this.estatura = estatura;
    }

}
