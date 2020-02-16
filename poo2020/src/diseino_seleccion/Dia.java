package diseino_seleccion;

public class Dia {
    private int n_dia;
    private String dia;

    public Dia(int n_dia){
        this.n_dia = n_dia;
    }

    public String sacar_dia(int n_dia, String dia){
        switch (n_dia){
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Ingrese un valor del 1-7";}
            return dia;
        }

    public void presentar(){
        System.out.println(" __________________________________________________________");
        System.out.println("|ESTUDIANTE:     "+sacar_dia(n_dia,dia) );
        System.out.println(" ___________________________________________________________");
    }

    public int getN_dia() {
        return n_dia;
    }

    public void setN_dia(int n_dia) {
        this.n_dia = n_dia;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
