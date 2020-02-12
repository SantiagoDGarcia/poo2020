package diseniopoo;

public class Cerveza {
    private int unidades_vendidas;
    private String tipo;
    private Double precio;
    private String nombre;

    public Cerveza(int unidades_vendidas, double precio, String tipo, String nombre){
        this.precio = precio;
        this.unidades_vendidas = unidades_vendidas;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public double calcular_ventas(int unidades_vendidas, double precio){
        double precioFinal = unidades_vendidas*precio;
        return precioFinal;
    }

    public void ficha(){
        System.out.println(" __________________________________________________________");
        System.out.println("|CERVEZA:     "+nombre );
        System.out.println("|TIPO:        "+tipo );
        System.out.println("|PRECIO:      "+precio );
        System.out.println("|UNIDADES V:  "+unidades_vendidas );
        System.out.println("|");
        System.out.println("|TOTAL VENTA: "+calcular_ventas(unidades_vendidas,precio));
        System.out.println(" ___________________________________________________________");
    }

    public int getUnidades_vendidas() {
        return unidades_vendidas;
    }

    public void setUnidades_vendidas(int unidades_vendidas) {
        this.unidades_vendidas = unidades_vendidas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
