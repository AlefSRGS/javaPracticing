package exercicesP2Unicap.lista1AnaEliza;
//2ª Questão: Implemente um programa para criar dois vetores de 15 números inteiros cada um, A e B. 
//O  programa deve preencher o vetor A com valores digitados pelo usuário. O vetor B deve ser preenchido 
//da  seguinte forma: os elementos de índice par são os correspondentes de A divididos por 2 e os elementos 
//de  índice ímpar são os correspondentes de A multiplicados por 3. Ao final, o programa deverá exibir os dois  
//vetores (A e B). 
//Exemplo: 
//Se o valor de A[3] for 10, então B[3] receberá o valor 30. 
//Se o valor de A[8] for 40, então B[8] receberá o valor 20. 
import java.util.Scanner;
public class question2 {
    public static boolean testPar(double num1){
        boolean test;
        if(num1%2 == 0){
            test = true;
        }else{
            test = false;
        }
        return test;
    }
    public static void FormatB(double[] arrayA) {
        for(int i = 0; i < arrayA.length;i++){
            if(testPar(i)==true){
                arrayA[i] /= 2; 
            }else{
                arrayA[i] *=3;
            }
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double[] listnum;
            listnum = new double[15];
            for(int i; i < listnum.length; i++){

            }

        }
        sc.close();
    }
}