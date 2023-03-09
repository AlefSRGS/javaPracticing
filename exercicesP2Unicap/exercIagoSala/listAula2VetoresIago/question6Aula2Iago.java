public class question6Aula2Iago {
    static boolean testVowel(Char word){
        word = word.toLowerCase();
        if(word == "a" || word == "e" || word == "i" || word == "o" || word == "u"){
            return true;
        }else{
            return false;
        }
    }
    static int countVowalInArray(Char[] listChar, int lenghtArray){
        int quantVowal =0;
        for(int i = 0; i< lenghtArray;i++){
            if(testVowel(listChar[i])){
                quantVowal++;
            }
        }
        return quantVowal;
    }
    public static void main(String[] args) {
        
    }
}
