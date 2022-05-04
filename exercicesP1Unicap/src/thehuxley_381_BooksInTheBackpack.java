import java.util.Scanner;
public class thehuxley_381_BooksInTheBackpack {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int backpackCapacity = 18; int atualWeight = 0; int totalBooks = 0;
        while(atualWeight <= backpackCapacity){
            int bookWeight = sc.nextInt();
            atualWeight += bookWeight;
            if(atualWeight<= backpackCapacity){
                totalBooks++;
            }
        }
        System.out.println(totalBooks);
        sc.close();
    }
}
