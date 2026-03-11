import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        int count = 0;
        while(N-- > 0){
            String log = br.readLine();
            if(log.equals("ENTER")){
                set.clear();
            }else if (set.add(log)){
                count++;
            }
        }
        System.out.println(count);
    }
}