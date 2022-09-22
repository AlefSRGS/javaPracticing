import java.util.Scanner;
public class signos {
	public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        
        if(day == 29 && month == 2 && year%4 != 0){
            System.out.print("Data Invalida");
        }
        else if(day >= 21 && day <=31 && month == 3){
            System.out.print("Aries");
        }else if(day <=19 && day >=1 && month == 4){
            System.out.print("Aries");
        }else if(day >= 20 && day <= 30 && month == 4){
            System.out.print("Touro");
        }else if(day <= 20 && day >= 1 && month == 5){
            System.out.print("Touro");
        }else if(day >= 21 && day <= 30 &&month ==5){
            System.out.print("Gemeos");
        }else if(day <= 21 && day >= 1 && month == 6){
            System.out.print("Gemeos");
        }else if(day >= 22 && day <= 30 && month == 6){
            System.out.print("Cancer");
        }else if(day <= 22 && day >= 1 && month == 7){
                System.out.print("Cancer");
        }else if(day >= 23 && day <= 30 && month == 7){
            System.out.print("Leao");
        }else if(day <= 22 && day >= 1 && month == 8){
            System.out.print("Leao");
        }else if(day >= 23 && day <= 31 && month == 8){
            System.out.print("Virgem");
        }else if(day <= 22 && day >= 1 && month == 9){
            System.out.print("Virgem");
        }else if(day >= 23 && day <= 30 && month == 9){
            System.out.print("Libra");
        }else if(day <= 22 && day >= 1 && month == 10){
            System.out.print("Libra");
        }else if(day >= 23 && day <= 31 && month == 10){
            System.out.print("Escorpiao");
        }else if(day <= 21 && day >= 1 && month == 11){
            System.out.print("Escorpiao");
        }else if(day >= 22 && day <= 30 && month == 11){
            System.out.println("Sargitario");
        }else if(day <= 21 && day >= 1 && month == 12){
            System.out.print("Sargitario");
        }else if(day >= 20 && day <= 31 && month == 12){
            System.out.print("Capricornio");
        }else if(day <= 19 && day >= 1 && month == 1){
            System.out.print("Capricornio");
        }else if(day <= 20 && day <= 31 && month == 1){
            System.out.print("Aquario");
        }else if(day <= 18 && day >= 1 && month == 2){
            System.out.print("Aquario");
        }else if(day >= 19 && day <= 29 && month == 2){
            System.out.print("Peixes");
        }else if(day <= 20 && day >= 1 && month == 3){
            System.out.print("Peixes");
        }else{
            System.out.print("Data Invalida");
        }
        sc.close();
    }
}
