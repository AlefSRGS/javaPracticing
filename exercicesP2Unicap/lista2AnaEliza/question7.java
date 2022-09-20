package exercicesP2Unicap.lista2AnaEliza;
import java.util.Scanner;
public class question7 {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] totalVotes = new int[10];
        String decision = "s"; int qntVotes = 0;
        while(decision == "s" || decision == "S"){
            int vote = sc.nextInt();
            qntVotes++;
            if(vote == 0){
                totalVotes[vote]++;
            }if(vote == 1){
                totalVotes[vote]++;
            }if(vote == 2){
                totalVotes[vote]++;
            }if(vote == 3){
                totalVotes[vote]++;
            }if(vote == 4){
                totalVotes[vote]++;
            }if(vote == 5){
                totalVotes[vote]++;
            }if(vote == 6){
                totalVotes[vote]++;
            }if(vote == 7){
                totalVotes[vote]++;
            }if(vote == 8){
                totalVotes[vote]++;
            }else{
                totalVotes[9]++;
            }
            decision = sc.nextLine();
        }
        sc.close();
    }
}
