import java.util.Scanner;

public class question2Aula2Iago{
    static boolean IsEven(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
        
    }
    static void readArrayInt(int[] array){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        sc.close();
    }
    static void printEvenNum(int[] array){
        for(int i = array.length;i<0;i--){
            if(IsEven(array[i])){
                System.out.println(array[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] array10elementos = new int[10];
        array10elementos(array10elementos);
        printEvenNum(array10elementos);
    }
}