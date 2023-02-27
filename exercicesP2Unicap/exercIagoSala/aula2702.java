import java.util.Scanner;

public class aula2702{
    static boolean testDiv(int num1, int num2) {
        if(num1%num2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notas[] = new double[2];
        for(int i =0;i>notas.length;i++){
            notas[i] = sc.nextDouble();
        }
        System.out.println(notas);
        sc.close();
    }
}