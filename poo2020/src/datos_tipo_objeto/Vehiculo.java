package datos_tipo_objeto;

public class Vehiculo {
    private String Placa;
    private String marca;
    private int anio;
    private String modelo;
    private String color;
    private int cilind;

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilind() {
        return cilind;
    }

    public void setCilind(int cilind) {
        this.cilind = cilind;
    }

    public Vehiculo(String placa, String marca, int anio, String modelo, String color, int cilind) {
        Placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.color = color;
        this.cilind = cilind;
    }
}
