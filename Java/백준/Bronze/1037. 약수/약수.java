import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (count-- > 0) {
            long val = Long.parseLong(st.nextToken());
            if (val > max) max = val;
            if (val < min) min = val;
        }

        System.out.println(max * min);
    }
}