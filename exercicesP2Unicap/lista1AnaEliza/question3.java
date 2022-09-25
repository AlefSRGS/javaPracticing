package lista1AnaEliza;
import java.util.Scanner;
public class question3 {
    public static void addVetores(double[] vetorA, double[] vetorB, double[] vetorC){
        for(int i = 0; i< vetorA.length;i++){
            vetorC[i] = vetorA[i] + vetorB[i]; 
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        double[] vetorA = new double[20];
        double[] vetorB = new double[20];
        double[] vetorC = new double[20];
        for(int i = 0; i < vetorA.length;i++){
            vetorA[i] =  sc.nextDouble();
        }
        for(int i = 0; i < vetorB.length;i++){
            vetorB[i] =  sc.nextDouble();
        }
        addVetores(vetorA, vetorB, vetorC);
        System.out.println(vetorC);
        sc.close();
    }
}
