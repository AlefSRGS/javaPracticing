import java.util.Scanner;
public class beecrowd_1013_TheGreatest {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int maiorAB = (a+ b +Math.abs(a-b));
		int maiorABC = (maiorAB+ c +Math.abs(maiorAB-c));
		System.out.println(maiorABC+" eh o maior");
		sc.close();
    }
}
