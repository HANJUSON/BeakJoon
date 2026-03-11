import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new LinkedList<>();
        int num = 0;
        while(N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            if(st.hasMoreTokens()){
                num = Integer.parseInt(st.nextToken());
            }

            switch(command){
                case 1:
                    queue.offer(num);
                    break;
                case 2:
                    queue.offerFirst(num);
                    break;
                case 3:
                    if(queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.pollLast());
                    }
                    break;
                case 4:
                    if(queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.poll());
                    }
                    break;
                case 5:
                    System.out.println(queue.size());
                    break;
                case 6:
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;
                case 7:
                    if(queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.peekLast());
                    }
                    break;
                case 8:
                    if(queue.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(queue.peek());
                    }
                    break;

            }
        }
        
    }
}