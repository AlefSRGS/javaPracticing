import java.util.Scanner;

public class aula0203{
    static void preencherArray(double[] lista){
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<lista.length;i++){
            lista[i] = sc.nextDouble();
        }
        sc.close();
    }
    static void printList(double[] lista){
        for(int i =0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }
    public static void main(String[] args) {
        double listaArray[] = new double[10];
        preencherArray(listaArray);
        printList(listaArray);
    }
}