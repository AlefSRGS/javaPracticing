package exercicesP2Unicap.list1Diego;
public class question1 {
    public class SumDivision {
        static double Sum(double addend1, double addend2){
            return addend1 + addend2;
        }
        static double divide(double dividend, double divisor){
            return dividend / divisor;
        }
    }
    public static void main(String[] args) throws Exception{
        double n = 15;
        double result = SumDivision.Sum(n, 0);
        double result2 = SumDivision.divide(n, 1);
    }
}
