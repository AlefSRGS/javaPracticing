import java.util.Scanner;

public class calculatorFactorial {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println(result);
        sc.close();
    }
    //exemplo de uso de recursão(uma função chamando a outra)
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
}
