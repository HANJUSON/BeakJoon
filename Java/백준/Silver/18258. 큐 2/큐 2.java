import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        
        
        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int num = 0;
            if(st.hasMoreTokens()){
                num = Integer.parseInt(st.nextToken());
            }

            switch(command){
                case "push":
                    queue.offer(num);
                    break;
                case "pop":
                    if(queue.isEmpty()){
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(queue.poll()).append('\n');
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    if(queue.isEmpty()){
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                    break;
                case "front":
                    if(queue.isEmpty()){
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(queue.peek()).append('\n');
                    }
                    break;
                case "back":
                    if(queue.isEmpty()){
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(queue.peekLast()).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}