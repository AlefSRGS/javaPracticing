import java.util.Scanner;
public class numberPiCalculator {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double pointInCircle =0,x=0,y=0;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            x = Math.random()*2 -1;
            y = Math.random()*2 -1;

            boolean insideInCircle = x*x + y*y <=1;

            if(insideInCircle){
                pointInCircle++;
            }
        }
        double pi = pointInCircle*4/n;
        System.out.println(pi);
        sc.close();
    }
}
