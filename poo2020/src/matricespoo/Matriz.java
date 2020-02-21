package matricespoo;

public class Matriz{
    private int[][] matrizA = new int[3][3];
    private int[][] matrizB = new int[3][3];
    private int[][] matrizC = new int[3][3];

    // Constructor de objeto
    public Matriz ( int matrizA[][], int matrizB[][]){
        this.matrizA = matrizA;
        this.matrizB = matrizB;

    }

    public void sumaMatrices(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizC[i][j] = matrizA[i][j]+matrizB[i][j];
            }
        }

    }

    public void presentar() {

        System.out.println(" __________________________________________________________");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matrizA[i][j]+"+"+matrizB[i][j] + "=" +matrizC[i][j]);
            }
        }
        System.out.println(" __________________________________________________________");

    }


    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int[][] getMatrizB() {
        return matrizB;
    }

    public void setMatrizB(int[][] matrizB) {
        this.matrizB = matrizB;
    }

    public int[][] getMatrizC() {
        return matrizC;
    }

    public void setMatrizC(int[][] matrizC) {
        this.matrizC = matrizC;
    }
}
