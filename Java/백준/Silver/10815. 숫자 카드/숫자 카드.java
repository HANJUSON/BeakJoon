import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> s1 = new HashSet<>(N); //hashset 선언


        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<N;i++){
            s1.add(Integer.parseInt(st.nextToken())); //hashset에 값 추가
        }

        int M = Integer.parseInt(br.readLine());
        LinkedHashSet<Integer> s2 = new LinkedHashSet<>(M); //hashset 선언

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<M;i++){
            s2.add(Integer.parseInt(st2.nextToken())); //hashset에 값 추가
        }
        
        
        StringBuilder sb = new StringBuilder();
        for(int num : s2){
            if(s1.contains(num)){
                sb.append(1).append(' ');
            } else {
                sb.append(0).append(' ');
            }
        }

        System.out.print(sb.toString());
    }
}
