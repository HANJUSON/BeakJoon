import java.io.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> stack = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        while(N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            
            // 1번 명령일 때만 두 번째 숫자가 들어오므로 체크
            int value = 0;
            if (st.hasMoreTokens()) {
                value = Integer.parseInt(st.nextToken());
            }


            if(command == 1){
                stack.add(value); 
            }
            else if(command == 2){
                if(stack.size()>0){
                    System.out.println(stack.get(stack.size()-1));
                    stack.remove(stack.size()-1);
                }
                else{
                    System.out.println(-1);
                }
            }
            else if(command == 3){
                System.out.println(stack.size());
            }
            else if(command == 4){
                if(stack.size()>0) System.out.println(0);
                else System.out.println(1);
            }
            else if(command == 5){
                if(stack.size()>0) System.out.println(stack.get(stack.size()-1));
                else System.out.println(-1);
            }
        }
        
    }
}