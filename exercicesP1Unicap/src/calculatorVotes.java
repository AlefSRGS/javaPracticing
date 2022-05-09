import java.util.Scanner;
public class calculatorVotes {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        char decision = 's';
        int mariaVote = 0, pedroVote = 0, luisVote = 0;
        int paulaVote = 0, franciscoVote = 0, brancoVote = 0;
        int nuloVote = 0;
        while(decision == 's'){
            System.out.print("Qual sera seu voto: ");
            int caditateVote = sc.nextInt();
            switch(caditateVote){
                case 1:
                mariaVote++;
                break;
                case 2:
                pedroVote++;
                break;
                case 3:
                luisVote++;
                break;
                case 4:
                paulaVote++;
                break;
                case 5:
                franciscoVote++;
                break;
                case 6:
                brancoVote++;
                break;
                default:
                nuloVote++;
            }
            System.out.println("deseja continuar a votar?"); 
            decision = sc.next().charAt(0);
        }
        int validVotes = mariaVote+pedroVote+luisVote+paulaVote+franciscoVote;
        int totalVotes = mariaVote+pedroVote+luisVote+paulaVote+franciscoVote+nuloVote+brancoVote;
        int porcentagemValidVotes = (validVotes/totalVotes)*100;
        int porcentagemBrancoVotes = (brancoVote/totalVotes)*100;
        int porcentagemNuloVotes = (nuloVote/totalVotes )*100;

        System.out.printf("total de votor de maria: %d\n",mariaVote);
        System.out.printf("total de votor de pedro: %d\n",pedroVote);
        System.out.printf("total de votor de luis: %d\n",luisVote);
        System.out.printf("total de votor de paula: %d\n",paulaVote);
        System.out.printf("total de votor de francisco: %d\n",franciscoVote);
        System.out.printf("total de votor de branco: %d\n",brancoVote);
        System.out.printf("total de votor de nulo: %d\n",nuloVote);
        
        System.out.printf("porcentagem de votos nulos sobre todos os votos: %d\n",porcentagemNuloVotes);
        System.out.printf("porcentagem de votos brancos sobre todos os votos: %d\n",porcentagemBrancoVotes);
        System.out.printf("porcentagem de votos validos sobre todos os votos: %d\n",porcentagemValidVotes);
        sc.close();
    }
}
