package exercicesP2Unicap.lista2AnaEliza;
import java.util.Scanner;
public class question1 {
    static double[] preencherVetor(double[] vetor){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<vetor.length;i++){
            vetor[i] = sc.nextDouble();
        }
        sc.close();
        return vetor;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}
