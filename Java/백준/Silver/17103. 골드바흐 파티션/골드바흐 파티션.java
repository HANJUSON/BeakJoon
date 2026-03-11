import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static boolean[] isPrime = new boolean[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        getPrimes();

        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            for (int i = 2; i <= n / 2; i++) {
                if (isPrime[i] && isPrime[n - i]) {
                    count++;
                }
            }
            sb.append(count).append("\n");  
        }
        System.out.print(sb);
    }

    public static void getPrimes() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= 1000000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}