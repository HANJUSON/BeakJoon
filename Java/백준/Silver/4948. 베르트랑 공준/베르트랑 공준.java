import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;
            int numOfprimes = 0;
            for(int i = n+1; i <= 2*n; i++){
                if (isPrime(i)) {
                    numOfprimes++;
                }
            }
            sb.append(numOfprimes).append("\n");
        }
        System.out.print(sb);
    }

    public static boolean isPrime(long x) {
        if (x < 2) return false;
        for (long i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}