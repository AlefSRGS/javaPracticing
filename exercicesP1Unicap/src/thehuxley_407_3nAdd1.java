import java.util.Scanner;
public class thehuxley_407_3nAdd1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); int n2 = sc.nextInt(); int cycleSize = 1;
        if(n2<n1){
            int temp = n1;
            n2 = n1;
            n1 = temp;
        }
        while(n1<=n2){
            if(n1%2==0){
                n1/=2;
            }else{
                n1=n1*3+1;
            }
            cycleSize++;
        }
        System.out.printf("%f %f %f",n1,n2,cycleSize);
        sc.close();
    }     
}

