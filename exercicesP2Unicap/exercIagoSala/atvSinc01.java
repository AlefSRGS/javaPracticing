public class atvSinc01 {
    static boolean isPalindrome(char[] aSequence){
        boolean testPalindrome = true;
            for(int i =0;i<((aSequence.length/2)-1);i++){
                if(aSequence[i] == aSequence[aSequence.length-i-1]){
                    testPalindrome = false;
                }
            }
        return testPalindrome;
    }
    public static void main(String[] args) {
        char[] testNotPalindrome = {'c','a','v','a','l','o'};
        System.out.println(isPalindrome(testNotPalindrome)); 
        char[] testPalindrome = {'R','O','M','A','M','E','T','E','M','A','M','O','R'};
        System.out.println(isPalindrome(testPalindrome)); 
    }
}
