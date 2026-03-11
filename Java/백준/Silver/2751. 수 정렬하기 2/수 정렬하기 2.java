import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());


        ArrayList<Integer> nums = new ArrayList<>();

        for(int i =0; i < N; i++){
            nums.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(nums);
        for (int val : nums) {
            sb.append(val).append('\n');
        }

        System.out.println(sb);
    
    }
}