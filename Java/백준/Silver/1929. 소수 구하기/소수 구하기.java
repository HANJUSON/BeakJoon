import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken()); // 소수찾기 시작
        int N = Integer.parseInt(st.nextToken()); // 소수찾기 끝

        while (M <= N) {
            if (isPrime(M)) {
                sb.append(M).append("\n");
            }
            M++; // 다음 소수 판별
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