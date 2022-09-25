package lista2AnaEliza;
import java.util.Scanner;
public class question7 {
    static void preencherVotes(int[] vetorVotes){
        Scanner sc = new Scanner(System.in);
        String decision = "s";
        while(decision == "s" || decision == "S"){
            int vote = sc.nextInt();
            if(vote == 0){
                vetorVotes[vote]++;
            }if(vote == 1){
                vetorVotes[vote]++;
            }if(vote == 2){
                vetorVotes[vote]++;
            }if(vote == 3){
                vetorVotes[vote]++;
            }if(vote == 4){
                vetorVotes[vote]++;
            }if(vote == 5){
                vetorVotes[vote]++;
            }if(vote == 6){
                vetorVotes[vote]++;
            }if(vote == 7){
                vetorVotes[vote]++;
            }if(vote == 8){
                vetorVotes[vote]++;
            }else{
                vetorVotes[9]++;
            }
            decision = sc.nextLine();
        }
        sc.close();
    }
    static int countTotalVotes(int[] totalVotes){
        int countVotes = 0;
        for(int i = 0;i<totalVotes.length-1;i++){
            countVotes+=totalVotes[i];
        }
        return countVotes;
    }
    static double[] percent(int[] total){
        double[] percentCandidatos = new double[total.length];
        int qntTotal = countTotalVotes(total);
        for(int i = 0;i<total.length-1;i++){
            percentCandidatos[i] = (total[i]/100)*qntTotal;
        }
        return percentCandidatos;
    }
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] votes = new int[10];
        String[] optionsToVote = {"branco","João","Maria","Pedro","Luís","Ana","Luiza","Silvia","André","nulo"};
        preencherVotes(votes);
        double[] percentCandidatos = percent(votes);
        for(int i=0;i<votes.length-1;i++){
            System.out.printf("Votos em %s tem o percentual de %.2f"+"%",optionsToVote[i],percentCandidatos[i]);
        }
        sc.close();
    }
}