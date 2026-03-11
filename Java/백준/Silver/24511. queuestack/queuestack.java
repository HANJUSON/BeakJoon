import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        ArrayDeque<Integer> B = new ArrayDeque<>();

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            if(A[i] == 0){
                B.offer(Integer.parseInt(st2.nextToken()));
            }
            else{
                st2.nextToken();
            }
        }

        int M = Integer.parseInt(br.readLine());

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            int num = Integer.parseInt(st3.nextToken());
           
            B.offerFirst(num);
            sb.append(B.pollLast()).append(" ");
            
        }

        System.out.println(sb);
    }
}