import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();


        for(int i = 1; i<=N; i++){

            int sum=0;
            int tmp = i;
            while (tmp > 0) { //각 자릿수 구하기
                sum+=tmp%10;
                tmp /= 10;  
            }
            if(N == i + sum){
                System.out.println(i);
                break;
            }

            if(N == i) {
                System.out.print(0); 
                break;
            }
        }
        

    
        
        scanner.close();
    }
}