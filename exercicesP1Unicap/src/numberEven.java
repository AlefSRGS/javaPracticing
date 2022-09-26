import java.util.Scanner;

public class numberEven {

	public static void main(final String[] args) {


		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1%2==0 && num2%2==0){
			System.out.println("All numbers are even.");
		}else if(num1%2==0){
			System.out.printf("Only the number %d is even.\n",num1);
		}else if(num2%2==0){
			System.out.printf("Only the number %d is even.\n",num2);
		}else{
			System.out.println("All numbers are odd.");
		}
		sc.close();
	}
}