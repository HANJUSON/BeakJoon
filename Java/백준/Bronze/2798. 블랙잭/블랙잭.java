import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        long M = scanner.nextLong();

        //카드할당
        int[] cards = new int[N];
        for(int i = 0; i<N; i++){
            cards[i] = scanner.nextInt();
        }
        Arrays.sort(cards);

        long max = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    long sum = cards[i] + cards[j] + cards[k];
                    if (sum <= M && sum > max) {
                        max = sum;
                    }
                }
            }
        }
System.out.println(max);

    
        
        scanner.close();
    }
}