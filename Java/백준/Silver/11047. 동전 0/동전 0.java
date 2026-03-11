import java.io.*;
import java.util.*;
import java.util.Random;

public class Main {
    public static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        count = 0;
        while(N-->0){
            if(arr[N] <= K){
                count++;
                K -= arr[N];
                N++;
            }

        }
        System.out.println(count);
    }
}