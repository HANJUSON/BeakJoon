import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int target = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            queue.offer(Integer.parseInt(st.nextToken()));
        }
        while(target <= N){
            if(!queue.isEmpty() && queue.peek() == target){
                queue.poll();
                target++;
            }
            else if(!stack.isEmpty() && stack.peek() == target){
                stack.pop();
                target++;
            }
            else if(!queue.isEmpty()){
                stack.push(queue.poll());
            }
            else{
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
    }
}