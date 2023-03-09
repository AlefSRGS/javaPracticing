public class question7Aula2Iago {
    static void reverseArrayChar(Char listChar, int lengthArray){
        Char[] reverceArray = new Char[lengthArray];
        for(int indexArrayChar = 0;indexArrayChar<lengthArray;indexArrayChar++){
            for(int indexArrayReverse =lengthArray;indexArrayReverse<0;indexArrayReverse--){
                reverceArray[indexArrayReverse] = listChar[indexArrayChar];
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
