import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        while (T-- > 0) {
            long n = Long.parseLong(br.readLine());

            // n보다 크거나 같은 소수 찾기
            while (true) {
                if (isPrime(n)) {
                    sb.append(n).append("\n");
                    break;
                }
                n++; // 소수가 아니면 1 증가
            }
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