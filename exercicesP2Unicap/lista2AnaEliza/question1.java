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
    static double[] getLucros(double[] vetGanhos, double[] vetGastos){
        double[] vetLucros = new double[vetGanhos.length];
        for(int i=0; i<vetGanhos.length;i++){
            vetLucros[i] = vetGanhos[i] - vetGastos[i];
        }
        return vetLucros;
    }
    static void vetExibir(double[] vet1){
        for(int i = 0;i<vet1.length;i++){
            System.out.println(vet1[i]);
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}
