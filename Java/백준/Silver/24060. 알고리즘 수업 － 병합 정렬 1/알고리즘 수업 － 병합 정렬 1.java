import java.io.*;
import java.util.*;

public class Main {
    public static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st2.nextToken());
        }
        mergeSort(A, 0, N - 1, K);
        if(count < K){
            System.out.println(-1);
        }


    }
    public static int[] mergeSort(int[] A, int p, int r, int K){
        if(p < r){
            int q = (p + r) / 2;
            mergeSort(A, p, q, K);
            mergeSort(A, q + 1, r, K);
            merge(A, p, q, r, K);
        }
        return A;
    }
    public static void merge(int[] A, int p, int q, int r, int K){
        int i = p;
        int j = q + 1;
        int t = 0;
        int[] tmp = new int[r - p + 1];
        while(i <= q && j <= r){
            if(A[i] <= A[j]){
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
        }
        while(i <= q){
            tmp[t++] = A[i++];
        }
        while(j <= r){
            tmp[t++] = A[j++];
        }
        i = p;
        t = 0;
        while(i <= r){
            A[i++] = tmp[t++];
            count++;
            if(count == K){
                System.out.println(A[i - 1]);
                return;
            }
        }
    }
}