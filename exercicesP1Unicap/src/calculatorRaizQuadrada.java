import java.util.Scanner;
public class calculatorRaizQuadrada{
  public static void main(final String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		double s = sc.nextDouble();
		double sqrt = sqrt(s);
		System.out.printf("%.4f\n",sqrt);
		sc.close();
	}
	public static double sqrt(double c) {
			double x1 = c; 
			double e = c;
			while(e > 0.00001){
				e = Math.abs(x1 -(c/x1));
				x1 = (x1 + c/x1)/2;
			}
			return x1;
		}
}