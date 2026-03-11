import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // 1. 큐 생성 및 1부터 N까지 카드 넣기
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        // 2. 카드가 1장 남을 때까지 반복
        while (queue.size() > 1) {
            queue.poll();              // 맨 앞 카드 버리기
            queue.offer(queue.poll()); // 그다음 카드 맨 뒤로 이동
        }

        // 3. 마지막 남은 카드 출력
        System.out.println(queue.peek());
    }
}