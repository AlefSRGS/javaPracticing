import java.util.Scanner;
public class beecrowd_1019_TimeConversion {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hours = n/3600;
        int minutes = (n%3600)/60; 
        int seconds = (n%3600)%60;
        System.out.printf("%d:%d:%d\n",hours,minutes,seconds);
        sc.close();
    }
}
