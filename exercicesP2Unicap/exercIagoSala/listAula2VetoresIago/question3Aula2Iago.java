import question2Aula2Iago;
public class question3Aula2Iago {
    static void replaceNum(int[] array){
        for(int i=0;i<array.length;i++){
            if(question2Aula2Iago.IsEven(array[i])){
                array[i] = 1;
            }else{
                array[i] = -1;
            }
        }
    }
    public static void main(String[] args) {
        int[] array10elementos = new int[10];
        question2Aula2Iago.readArrayInt(array10elementos);
        replaceNum(array10elementos);
    }
}
