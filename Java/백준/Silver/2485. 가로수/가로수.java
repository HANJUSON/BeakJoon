import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];
        for(int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        // 1. 간격들을 구하면서 동시에 모든 간격의 GCD를 구함
        int commonGcd = 0;
        for(int i = 0; i < N - 1; i++) {
            int interval = trees[i + 1] - trees[i];
            if (i == 0) {
                commonGcd = interval;
            } else {
                commonGcd = gcd(commonGcd, interval);
            }
        }

        // 2. 총 필요한 나무 개수 계산
        long result = (long)(trees[N-1] - trees[0]) / commonGcd - (N - 1);

        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}