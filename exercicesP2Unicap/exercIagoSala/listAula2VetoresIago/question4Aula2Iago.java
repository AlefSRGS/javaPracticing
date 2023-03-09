import question1Aula2Iago;
public class question4Aula2Iago {
    static void printEvenIndex(double[] array){
        for(int i=0; i<array.length;i+=2){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        double[] array10elementosReais = new double[10];
        question1Aula2Iago.readArrayDouble(array10elementosReais);
        printEvenIndex(array10elementosReais);
    }
}
