package proyectopoo;

public class Comprado extends Producto{

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

    /**
     * @return the detalle
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    private String detalle;
    private String tipo;

    public Comprado(String tipo, String nombre,String detalle ,int stock, double precio) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.detalle = detalle;
        this.stock = stock;
        this.precio = precio;
    }
    
    
    
    
}
