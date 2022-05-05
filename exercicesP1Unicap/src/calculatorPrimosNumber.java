import java.util.Scanner;
public class calculatorPrimosNumber{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = isPrime(n);
        System.out.printf("Number %d is prime %b",n,isPrime);
        sc.close();
    }
    public static boolean isPrime(int n){
        int p =2;
        boolean isPrime = true;
        while(p<n){
            boolean isDivisible = isDivisible(n,p);
            if(isDivisible){
                isPrime = false;
                break;
            }else{
                p++;
            }
        }
    return true;
    }
    public static boolean isDivisible(int dividend, int divisor) {
        return dividend % divisor == 0;
    }
}