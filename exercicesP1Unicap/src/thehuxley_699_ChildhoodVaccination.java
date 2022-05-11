import java.util.ArrayList;
import java.util.Scanner;
public class thehuxley_699_ChildhoodVaccination {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nextVaccines = new ArrayList<>();
        int firstYear =  sc.nextInt();
        int periodicity = sc.nextInt();
        if(periodicity<=0){
            System.out.println("Type a period greater than zero!");
        }else{
            int finalYear = firstYear + 3*periodicity;
            while(firstYear<finalYear){
                firstYear+=periodicity;
                nextVaccines.add(firstYear);
            }
            System.out.printf("%d %d %d\n",nextVaccines.get(0),nextVaccines.get(1),nextVaccines.get(2));
        }
        sc.close();
    }
}
