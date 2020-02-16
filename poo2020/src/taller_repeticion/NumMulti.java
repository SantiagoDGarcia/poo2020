package taller_repeticion;

public class NumMulti {
    // Declaracion de Variables
    private int num1;
    private int num2;
    private int number;
    private String test;

    // Constructor de objeto
    public NumMulti(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Metodo para calcular la multiplicacion
     * @param num1
     * @param num2
     * @param number
     * @return
     */
    public int calcular_mutliplicacion(int num1, int num2, int number){
        number = num1*num2;
        return number;
    }

    /**
     * Metodo vacio para realizar la presentacion
     */
    public void presentar(){
        System.out.println(" __________________________________________________________");
        System.out.printf(" %d", num1);
        for(int i=1; i < num2 ;i++){
            System.out.printf("+%d", num1);
        }
        System.out.println("|Resultado:      "+calcular_mutliplicacion(num1,num2,number));
        System.out.println(" ___________________________________________________________");
    }

    /**
     * Metodo para obtener numero1
     * @return num1
     */
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * Metodo para obtener numero2
     * @return num2
     */
    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
