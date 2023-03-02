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
    static double mediaArray(double[] notas){
        double media = 0;
        for(int i=0;i<notas.length;i++){
            media += notas[i];
        }
        media /= notas.length;
        return media;
    }
    public static void main(String[] args) {
        double listaArray[] = new double[10];
        preencherArray(listaArray);
        printList(listaArray);
        System.out.println(mediaArray(listaArray));
    }
}