package arreglospoo;

public class Arreglo {
    private  int[] vectorA = new int [10];
    private  int[] vectorB = new int [10];
    private int sumatoriaProducto;

    // Constructor de objeto
    public Arreglo ( int vectorA[], int vectorB[]){
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }


    public int calcular_sumatoriaProducto (){
        sumatoriaProducto = 0;
        for(int i=0; i<10; i++){
            sumatoriaProducto = (vectorA[i]*vectorB[i]) + sumatoriaProducto;
        }
        return sumatoriaProducto;
    }


    public void presentar(){
        System.out.println(" __________________________________________________________");
        System.out.println("|RESULTADO:  "+ calcular_sumatoriaProducto());
        System.out.println(" ___________________________________________________________");
    }

    public int[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    public int[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    public int getSumatoriaProducto() {
        return sumatoriaProducto;
    }

    public void setSumatoriaProducto(int sumatoriaProducto) {
        this.sumatoriaProducto = sumatoriaProducto;
    }
}
