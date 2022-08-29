import java.util.Scanner;
public class beecrowd_1004_SimpleProduct {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int prod = num1 * num2;
      System.out.printf("PROD = %d\n",prod);
      sc.close();
    }
}
