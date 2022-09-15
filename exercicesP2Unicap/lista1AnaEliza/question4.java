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
    static boolean[] testAprov(double[] listMedias){
        boolean[] listTest = new boolean[20];
        for(int i =0;i<listMedias.length;i++){
            if(listMedias[i]>=7){
                listTest[i]=true;
            }else{
                listTest[i]=false;
            }
        }
        return listTest;
    }
    static String[] makeListAproveOrNot(String[] listNames, double[] list1, double[] list2){
        double[] listMedias = calculatorMediaNotas(list1, list2);
        boolean[] listTest = testAprov(listMedias);
        String[] listAprov; String[] listReporv;
        for(int i = 0; i<listMedias.length;i++){
            if(listTest[i] == true){
                listAprov[i] = lis
            }
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String[] nomeAlunos = new String[20];
        double[] primeirasNotas = new double[20];
        double[] segundasNotas = new double[20];
        sc.close();
    }
}
