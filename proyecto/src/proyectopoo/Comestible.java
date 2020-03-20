package proyectopoo;

public class Comestible extends Producto{

    /**
     * @return the peso_neto
     */
    public String getPeso_neto() {
        return peso_neto;
    }

    /**     
     * @param peso_neto the peso_neto to set
     */
    public void setPeso_neto(String peso_neto) {
        this.peso_neto = peso_neto;
    }

    private String peso_neto;

    public Comestible(String nombre, int stock, double precio, String peso_neto) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.peso_neto = peso_neto;
    }
    
    
    
    
}
