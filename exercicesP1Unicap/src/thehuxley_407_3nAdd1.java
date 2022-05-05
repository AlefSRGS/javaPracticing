import java.util.Scanner;
public class thehuxley_407_3nAdd1 {
    public static void main(String[] args) throws Exception {
        //imcompleta
        Scanner sc = new Scanner(System.in);
        int n1=0; int n2=0; int cycleSize = 1; int maxCycleSize=0;
        if(n2<n1){
            int temp = n1;
            n2 = n1;
            n1 = temp;
        }
        while(sc.hasNextInt()){
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            maxCycleSize = maxCycleSize(n1, n2);
        }
        System.out.printf("%d %d %d",n1,n2,maxCycleSize);
        sc.close();
    }
    public static int cycleSize(int n1) {
        int cycleSize = 1;
        int temp = n1;
        while(temp != n1){
            cycleSize++;
            if(temp %2==0){
                temp /= 2;
            }else{
                temp= temp*3 +1;
            }
        }
        return cycleSize;
    }
    public static int maxCycleSize(int n1,int n2) {
        int maxCyclesize = 1;
        for(int i =n1;i<n2;i++){
            int cycleSize = cycleSize(n1);
            if(cycleSize>maxCyclesize){
                maxCyclesize = cycleSize;
            }
        }
        return maxCyclesize;
    }   
}

