import java.util.Scanner;
public class beecrowd_1012_Area {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextFloat()){
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            double triangle = (a*c)/2;
            double circle =  3.14159 * c*c;
            double trapezium = ((a+b)*c)/2;
            double square = b*b;
            double rectangle = a*b;
            System.out.printf("TRIANGULO: %.3f\n",triangle);
            System.out.printf("CIRCULO: %.3f\n",circle);
            System.out.printf("TRAPEZIO: %.3f\n",trapezium);
            System.out.printf("QUADRADO: %.3f\n",square);
            System.out.printf("RETANGULO: %.3f\n",rectangle);
        }
        sc.close();
    }
}