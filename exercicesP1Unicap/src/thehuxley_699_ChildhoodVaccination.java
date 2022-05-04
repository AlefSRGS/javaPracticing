import java.util.Scanner;

public class thehuxley_699_ChildhoodVaccination {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int firstYear =  sc.nextInt();
        int periodicity = sc.nextInt();
        if(periodicity<=0){
            System.out.println("Type a period greater than zero!");
        }else{
            int finalYear = firstYear + 3*periodicity;
            while(firstYear<finalYear){
                firstYear++;
                System.out.print(finalYear+" ");
            }
        }
        
        sc.close();
    }
}
