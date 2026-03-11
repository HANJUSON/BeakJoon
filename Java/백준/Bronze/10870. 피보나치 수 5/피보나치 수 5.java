import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long N = Long.parseLong(st.nextToken());
        System.out.println(Fibonacci(N));

    }
    public static Long Fibonacci(Long n) {
        if (n == 0) return 0L;
        if (n == 1) return 1L;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}