import java.util.Scanner;
public class beecrowd_1009_SalaryWithBonus {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		String sellerName = sc.nextLine(); 
		double fixedSalary = sc.nextDouble();
		double saleTotal = sc.nextDouble();
		double bonus = (saleTotal/100)*15;
		System.out.printf("TOTAL = R$ %.2f\n" fixedSalary+bonus);
		sc.close();
    }
}
