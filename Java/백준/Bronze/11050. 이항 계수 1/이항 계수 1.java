import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long numerator = 1;   // 분자
        long denominator = 1; // 분모

        for (int i = 0; i < K; i++) {
            numerator *= (N - i);
            denominator *= (i + 1);
        }

        System.out.print(numerator / denominator);
    }
}