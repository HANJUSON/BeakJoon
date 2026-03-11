import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> s1 = new HashSet<>(N); //hashset 선언


        for(int i =0; i<N;i++){
            s1.add(br.readLine()); //hashset에 값 추가
        }

        int count = 0;
        for(int i =0; i<M;i++){
            if(s1.contains(br.readLine())){
                count++;
            }
        }

        System.out.print(count);
    }
}
