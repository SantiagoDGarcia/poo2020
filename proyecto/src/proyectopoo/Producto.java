package proyectopoo;

public abstract class Producto {

    public double getIva() { return iva;  }
    public void setIva(double iva) {  this.iva = iva; }
    
    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double subtotal) { this.subtotal = subtotal; }
    
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
    
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    protected String nombre;
    protected int stock;
    protected double precio;
    protected double iva;
    protected double subtotal;
    protected double total;
}
