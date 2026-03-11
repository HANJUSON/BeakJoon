import java.io.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> stack = new ArrayList<>();

        int K = Integer.parseInt(br.readLine());
        while(K-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                try {
                    stack.remove(stack.size() - 1);
                } catch (NoSuchElementException e) {
                    // 스택이 비어있을 때 0이 입력되는 경우 예외 처리
                }
            } else {
                stack.add(num);
            }
        }
        System.out.println(stack.stream().mapToInt(Integer::intValue).sum());
    }
}