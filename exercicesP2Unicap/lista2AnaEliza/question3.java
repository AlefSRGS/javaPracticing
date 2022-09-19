package exercicesP2Unicap.lista2AnaEliza;
import java.util.Scanner;
public class question3 {
    static void preencherVetores(String[] vetorNames, double[] vetorFirstGrade, double[] vetorSecondGrade, double[] vetorAverage, String[] vetorSituacion){
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<4;i++){
            if(i==0){
                for(int aux1=0;aux1<vetorNames.length-1;aux1++){
                    vetorNames[aux1] = sc.nextLine();
                }
            }
            if(i==1){
                for(int aux2=0;aux2<vetorFirstGrade.length-1;aux2++){
                    vetorFirstGrade[aux2] = sc.nextDouble();
                }
            }
            if(i==2){
                for(int aux1=0;aux1<vetorSecondGrade.length-1;aux1++){
                    vetorSecondGrade[aux1] = sc.nextDouble();
                }
            }
            if(i==3){
                for(int aux1=0;aux1<vetorAverage.length-1;aux1++){
                    vetorAverage[aux1] = sc.nextDouble();
                }
            }
            if(i==4){
                for(int aux1=0;aux1<vetorSituacion.length-1;aux1++){
                    vetorSituacion[aux1] = sc.nextLine();
                }
            }
        }
        sc.close();
    }
    static void calculatorMediaAndSituacion(double[] firstGrade, double[] secondGrade, double[] vetorMedias, String[] vetorSituacion){
        for(int i=0;i<vetorMedias.length;i++){
            vetorMedias[i] = (firstGrade[i]*2 + secondGrade[i]*3)/5;
            if(vetorMedias[i] >= 7){
                
            }
            }
        }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        sc.close(); 
    }
}
