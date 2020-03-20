package proyectopoo;


public class Oficina extends Producto{

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    private String marca;
    // Constructor de comestible tipo kilogramo
    public Oficina(String nombre, int stock, double precio, String marca) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.marca = marca;
    }
    
    
}
