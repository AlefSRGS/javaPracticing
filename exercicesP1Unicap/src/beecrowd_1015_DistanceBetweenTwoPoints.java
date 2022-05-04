import java.util.Scanner;
public class beecrowd_1015_DistanceBetweenTwoPoints {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextInt();
        double y1 = sc.nextInt();
        double x2 = sc.nextInt();
        double y2 = sc.nextInt();
        double distanceBetweenPoints = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.printf("%.4f",distanceBetweenPoints);
        sc.close();
    }
}
