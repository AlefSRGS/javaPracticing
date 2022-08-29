import java.util.Scanner;
public class beecrowd_1002_areaOfACircle {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double area = 3.14159 * (raio * raio);
		System.out.printf("A=%.4f\n",area);
		sc.close();
    }
}
