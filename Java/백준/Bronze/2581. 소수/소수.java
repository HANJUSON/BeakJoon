import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = scanner.nextInt();
        int N = scanner.nextInt();
        
        int sum = 0;
        int minimum = 0;
        for(int i = M; i <= N; i++){
            if (i < 2) continue; // 0, 1은 스킵
            
            boolean isPrime = true; // 소수라고 가정
            
            // 2부터 제곱근까지 나누어 보며 검사
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false; // 나누어떨어지면 소수가 아님
                    break; 
                }
            }
            
            if (isPrime) {
                sum += i;
                if(minimum == 0){
                    minimum = i;
                }
            }
        }
        
        //소수가 없을경우
        if(sum==0) System.out.println(-1);
        else{
            System.out.println(sum); 
            System.out.println(minimum);
        }
        
    

        scanner.close();

        }
    }