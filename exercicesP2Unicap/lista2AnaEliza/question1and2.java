package exercicesP2Unicap.lista2AnaEliza;
import java.util.Scanner;
public class question1and2 {
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
    static double sumVetor(double[] vet1){
        double vetorSomado = 0;
        for(int i = 0; i<vet1.length;i++){
            vetorSomado += vet1[i];
        }
        return vetorSomado;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        double[] vetorGanhos = new double[12];
        vetorGanhos = preencherVetor(vetorGanhos);
        double[] vetorGastos = new double[12];
        vetorGastos = preencherVetor(vetorGastos);

        double[] vetorLucros = new double[12];
        vetorLucros = getLucros(vetorGanhos, vetorGastos);

        vetExibir(vetorGanhos);
        vetExibir(vetorGastos);
        vetExibir(vetorLucros);

        System.out.println(sumVetor(vetorGanhos));
        System.out.println(sumVetor(vetorGastos));
        System.out.println(sumVetor(vetorLucros));
        sc.close();
    }
}
