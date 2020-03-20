package proyectopoo;

/**
 *
 * @author Sant Garcia
 */
public class Utensilio extends Producto{

    /**
     * @return the tipo_material
     */
    public String getTipo_material() {
        return tipo_material;
    }

    /**
     * @param tipo_material the tipo_material to set
     */
    public void setTipo_material(String tipo_material) {
        this.tipo_material = tipo_material;
    }
    
    private String tipo_material;
    
    public Utensilio(String nombre, int stock, double precio, String tipo_material) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.tipo_material = tipo_material;
    }

    
}
