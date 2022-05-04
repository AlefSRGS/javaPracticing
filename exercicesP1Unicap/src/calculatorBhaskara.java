import java.util.Scanner;

public class calculatorBhaskara {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if(a==0){
            System.out.println("Coeficient a cannot be zero!");
        }else{
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double delta = b*b - 4*(a*c);
            double x1 = -b - Math.sqrt(delta/2*a);
            double x2 = -b + Math.sqrt(delta/2*a);
            if(delta > 0){
                System.out.printf("The roots are %f and %f.\n",x1,x2);
            }else if(delta == 0){
                System.out.printf("The only root is %f.\n",x1);
            }else{
                System.out.println("There are no roots!");
            }
        }
        sc.close();
    }
}
