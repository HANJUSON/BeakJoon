import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase= Integer.parseInt(br.readLine());

        while(testcase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long K = Integer.parseInt(st.nextToken());
            long N = Integer.parseInt(st.nextToken());

            if(N/2 < K){
                K = N - K;
            }

            long numerator = 1;
            long denominator = 1;

            for (int i = 0; i < K; i++) {
                numerator *= (N - i);
                denominator *= (i + 1);
            }

            System.out.println(numerator / denominator);
        }
    }
}