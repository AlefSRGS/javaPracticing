package exercicesP2Unicap.lista1AnaEliza;
import java.util.Scanner;
public class question4 {
    static double[] calculatorMediaNotas(double[] list1, double[] list2){
        double[] medias = new double[20];
        for(int i = 0; i<list1.length;i++){
            medias[i] = (list1[i]*2+list2[i]*3)/5;
        }
        return medias;
    }
    static void testAprov(String[] listNames, double[] list1, double[] list2){
        double[] listMedias = calculatorMediaNotas(list1, list2);
        String[] listAprov = new String[20]; String[] listReprov = new String[20];
        for(int i =0;i<listMedias.length;i++){
            for(int aux = 0;aux <listMedias.length;aux++){
                if(listMedias[i]>=7){
                listAprov[aux] = listNames[i];
            }
            for(int aux2 = 0;aux2 <listMedias.length;aux2++){
                if(listMedias[i]<7){
                listReprov[aux2] = listNames[i];
                }
            }
            }
        }
        System.out.println(listAprov);
        System.out.println(listReprov);
    }
        
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String[] nomeAlunos = new String[20];
        double[] primeirasNotas = new double[20];
        double[] segundasNotas = new double[20];
        testAprov(nomeAlunos, primeirasNotas, segundasNotas);
        sc.close();
    }
}
