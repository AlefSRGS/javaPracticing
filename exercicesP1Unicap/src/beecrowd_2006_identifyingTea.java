import java.util.Scanner;
public class beecrowd_2006_identifyingTea {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int countTea =0;
        int typeTeawanted = sc.nextInt();
        while(sc.hasNextInt()){
            int typeTea1 = sc.nextInt();
            if(typeTea1==typeTeawanted){
                countTea++;
            }
            int typeTea2 = sc.nextInt();
            if(typeTea2==typeTeawanted){
                countTea++;
            }
            int typeTea3 = sc.nextInt();
            if(typeTea3==typeTeawanted){
                countTea++;
            }
            int typeTea4 = sc.nextInt();
            if(typeTea4==typeTeawanted){
                countTea++;
            }
            break;
        }
        System.out.println(countTea);
        sc.close();
    }
}