package proyectopoo;

public class Industrial  extends Producto{

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    private String tipo;
    
    
    public Industrial(String nombre, int stock, double precio, String tipo) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.tipo = tipo;
    }
    
    
}
