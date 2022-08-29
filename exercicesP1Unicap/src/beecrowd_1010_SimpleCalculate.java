import java.util.Scanner;
public class beecrowd_1010_SimpleCalculate {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int numberProduct1 = sc.nextInt();
            int numberUnitProduct1 = sc.nextInt();
            double priceUnitProduct1 = sc.nextDouble();
        while(sc.hasNext()){
            int numberProduct2 = sc.nextInt();
            int numberUnitProduct2 = sc.nextInt();
            double priceUnitProduct2 = sc.nextDouble();
            double totalValue = numberUnitProduct1*priceUnitProduct1 + numberUnitProduct2*priceUnitProduct2;
            System.out.printf("VALOR A PAGAR: R$ %.2f\n",totalValue);
        }
        }
        sc.close();
}
}
