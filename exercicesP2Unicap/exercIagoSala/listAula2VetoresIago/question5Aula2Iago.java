import java.util.Scanner;

import question2Aula2Iago;
public class question5Aula2Iago {
    static void printEvenNum2(int[] array, int lengthArray){
        for(int i=0;i<lengthArray;i++){
            if(question2Aula2Iago.IsEven(array[i])){
                System.out.println(array[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantArray = sc.nextInt();
        int[] arrayInt = new int[quantArray];
        printEvenNum2(arrayInt, quantArray);
        sc.close();
    }
}
