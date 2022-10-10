import java.util.Scanner;
public class thehuxley_407_3nAdd1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int i = sc.nextInt();
			int j = sc.nextInt();
			if(i>j){
				int aux = i;
				i = j;
				j = aux;
			}
			int maxCycleSize = 0;
			int k = i;
			while(i<=j){
				int cycleSize = 1;
				int n = i;
				while(n != 1){
					if(n%2==0){
						n/=2;
						cycleSize++;
					}else if(n%2!=0){
						n = n*3+1;
						cycleSize++;
					}
				}
				if(cycleSize> maxCycleSize){
					maxCycleSize = cycleSize;
				}
				i++;
			}
			System.out.printf("%d %d %d\n",k,j,maxCycleSize);
		}
		sc.close();
    }   
}

