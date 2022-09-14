package exercicesP2Unicap.list1Diego;
public class question2 {
    class Volume {
            static String getName(int volume){
                String result;
                if(volume <= 0){
                    return result = "Min Volume";

                }else if(volume > 0 && volume <= 25){
                    return result = "Low Volume";

                }else if(volume > 25 && volume <= 75){
                    return result = "Medium Volume";

                }else if(volume > 75 && volume < 100){
                    return result =  "High Volume";

                }else if(volume >= 100){
                    return result = "Max Volume";

                }else{
                    return null;
                }
            }
        }
    public static void main(String[] args) throws Exception{
        int volume = 25;
        String result = Volume.getName(volume);
        System.out.println(result);
    }
}
