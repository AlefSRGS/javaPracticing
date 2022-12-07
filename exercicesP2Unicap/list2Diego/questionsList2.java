package list2Diego;
import java.util.Scanner;
public class questionsList2 {
    static class Utils{
        static int[] buildVectorRepeat(int repetitions, int value){
            int[] vetor = new int[repetitions];
            for(int i = 0; i<repetitions;i++){
                vetor[i] = value;
            }
            return vetor;
        }
        static int[] buildVectorSequence(int sequenceSize,int startValue){
            int[] vetor =  new int[sequenceSize];
            vetor[0] = startValue;
            for(int i = 1; i<sequenceSize;i++){
                vetor[i] = startValue++;
            }
            return vetor;
        }
        static int dotProduct(int[] a, int[] b){
            int escalarProductAB = 0;
            for(int i = 0; i < a.length;i++){
                escalarProductAB += a[i] * b[i];
            }
            return escalarProductAB;
        } 
        static boolean isPalindrome(int[] aSequence){
            boolean testPalindrome = true;
                for(int i =0;i<((aSequence.length/2)-1);i++){
                    if(aSequence[i] != aSequence[aSequence.length-i-1]){
                        testPalindrome = false;
                    }
                }
            return testPalindrome;
        }
    }
    public static void main(String[] args)throws Exception{
        //testing methods
        Scanner sc = new Scanner(System.in);
        int[] listnum1 = new int[4];
        for(int i = 0; i < listnum1.length; i++){
            listnum1[i] = sc.nextInt();
        }
        System.out.println(Utils.isPalindrome(listnum1));
        sc.close();
    }
}