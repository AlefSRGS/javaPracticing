import java.util.Scanner;

public class question1Aula2Iago{
    static void readArrayDouble(double[] array){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextDouble();
        }
        sc.close();
    }
    static void getHigherNumAndIndex(double[] array){
        double higherNum = 0;
        int higherNumIndex = 0;
        for(int i=0;i<array.length;i++){
            if(i=0){
                higherNum = array[i];
                higherNumIndex = 0;
            }else if(higherNum < array[i]){
                higherNum = array[i];
                higherNumIndex = i;
            }
        }
        System.out.printf("Maior numero do array é %f e sua posição é %d.", higherNum, higherNumIndex);
    }
    public static void main(String[] args) {
        double[] listNum10 = new double[10];
        readArrayDouble(listNum10);
        getHigherNumAndIndex(listNum10);
    }
}