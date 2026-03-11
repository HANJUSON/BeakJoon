import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); //버퍼비우기
        String line = scanner.nextLine();
        String[] strNums = line.split(" ");
        
        int[] nums = new int[N];
        for (int i = 0; i < strNums.length; i++) {
            nums[i] = Integer.parseInt(strNums[i]); // 문자열을 정수로 변환
        }
        
        int count = 0;
        for (int num : nums) {
            if (num < 2) continue; // 0, 1은 스킵
            
            boolean isPrime = true; // 소수라고 가정
            
            // 2부터 제곱근까지 나누어 보며 검사
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // 나누어떨어지면 소수가 아님
                    break; 
                }
            }
            
            if (isPrime) {
                count++;
            }
        }
        System.out.print(count);

        scanner.close();

        }
    }