import java.util.Scanner;
public class beecrowd_1013_TheGreatest {
    public static void main(String[] args) throws Exception {
        while(sc.hasNextInt()){
        int a = sc.nextInt(); 
	int b = sc.nextInt();
	int c = sc.nextInt();
        int maiorAB = (a+b+Math.abs(a-b))/2;
        int maiorABC = (maiorAB+c+Math.abs(maiorAB-c))/2;
        System.out.printf("%d eh o maior\n",maiorABC);
    }
        sc.close();
    }
}
