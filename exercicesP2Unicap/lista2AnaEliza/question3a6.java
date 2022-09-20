package exercicesP2Unicap.lista2AnaEliza;
import java.util.Scanner;
public class question3a6 {
    static double[] calculatorMedia(double[] firstGrade, double[] secondGrade){
        double[] vetorMedias = new double[firstGrade.length];
        for(int i=0;i<vetorMedias.length-1;i++){
            vetorMedias[i] = (firstGrade[i]*2 + secondGrade[i]*3)/5;
        }
        return vetorMedias;
    }
    static void preencherVetores(String[] vetorNames, double[] vetorFirstGrade, double[] vetorSecondGrade, double[] vetorAverage, String[] vetorSituacion){
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<2;i++){
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
                for(int aux3=0;aux3<vetorSecondGrade.length-1;aux3++){
                    vetorSecondGrade[aux3] = sc.nextDouble();
                }
            }
            vetorAverage = calculatorMedia(vetorFirstGrade, vetorSecondGrade);
            for(int aux4 =0;aux4<vetorAverage.length-1;aux4++){
                if(vetorAverage[aux4]>=7){
                    vetorSituacion[aux4]="aprovado";
                }else if(vetorAverage[aux4]>=3){
                    vetorSituacion[aux4]="recuperação";
                }else{
                    vetorSituacion[aux4]="reprovado";
                }
            }
        }
        sc.close();
    }
    static void exibirResult(String[] vetorNomes, double[] vetorMedias, String[] vetorSituação){
        for(int i = 0; i<vetorNomes.length-1;i++){
            System.out.printf("O aluno %s obteve média %f e está %s", vetorNomes, vetorMedias, vetorSituação);
        }
    }
    static double calculatorAverageClass(double[] vetorMedias){
        double averageClass = 0;
        for(int i =0; i<vetorMedias.length;i++){
            averageClass += vetorMedias[i];
        }
        averageClass /= vetorMedias.length;
        return averageClass;
    }
    static double percentAverage(double[] vetorMedias, double mediaTurma){
        int qntMediasBaixas = 0;
        for(int i =0;i<vetorMedias.length-1;i++){
            if(vetorMedias[i]<mediaTurma){
                qntMediasBaixas++;
            }
        }
        double percentMedias = (qntMediasBaixas/100)*vetorMedias.length;
        return percentMedias; 
    }
    static double biggerAverage(double[] vetorMedias){
        double maiorMedia =0;
        for(int i = 0; i<vetorMedias.length-2;i++){
            maiorMedia = vetorMedias[i]+vetorMedias[i+1]+Math.abs(vetorMedias[i]-vetorMedias[i+1]); 
        }
        return maiorMedia;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String[] listNames =  new String[50];
        double[] listFirstGrade =  new double[50];
        double[] listSecondGrade =  new double[50];
        double[] listAverage =  new double[50];
        String[] listSituacion =  new String[50];
        preencherVetores(listNames, listFirstGrade, listSecondGrade, listAverage, listSituacion);
        double averageClass = calculatorAverageClass(listAverage);
        exibirResult(listNames, listAverage, listSituacion);
        sc.close(); 
    }
}