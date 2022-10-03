import java.util.Scanner;
public class higherNumber {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        double num3 = sc.nextInt();
        
        if(num1 >= num2 && num1 >= num3 && num2 >= num3){
            System.out.printf("%f >= %f >= %f", num1, num2, num3);

        }else if(num2 >= num1 && num2 >= num3 && num1 >= num3){
            System.out.printf("%f >= %f >= %f", num2, num1, num3);

        }else if(num1 >= num2 && num1 >= num3 && num3 >= num2){
            System.out.printf("%f >= %f >= %f", num1, num3, num2);

        }else if(num3 >= num1 && num3 >= num2 && num2 >= num1){
            System.out.printf("%f >= %f >= %f", num3, num2, num1);

        }else if(num2 >= num1 && num2 >= num3 && num3 >= num1){
            System.out.printf("%f >= %f >= %f", num2, num3, num1);

        }else if(num3 >= num1 && num3 >= num3 && num1 >= num2){
            System.out.printf("%f >= %f >= %f", num3, num1, num2);
        }
        sc.close();
    }
}
