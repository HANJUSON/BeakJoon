import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Deque<int[]> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 1; i <= N; i++) {
            deque.add(new int[]{i, Integer.parseInt(st.nextToken())});
        }

        StringBuilder sb = new StringBuilder();
        
        while (!deque.isEmpty()) {
            // 1. 현재 맨 앞에 있는 풍선을 터뜨림
            int[] current = deque.pollFirst();
            int index = current[0];
            int move = current[1];
            
            sb.append(index).append(" ");
            
            // 풍선이 더 이상 없으면 종료
            if (deque.isEmpty()) break;

            // 2. 적힌 숫자만큼 이동
            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(move); i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }
        
        System.out.println(sb.toString().trim());
    }
}