import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>(Arrays.asList("ChongChong"));

        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();

            if(set.contains(A)){
                set.add(B);
            }
            else if(set.contains(B)){
                set.add(A);
            }
        }
        System.out.println(set.size());
    }
}