import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

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


        
        TreeSet<String> result = new TreeSet<>(); //트리셋 선언(정렬을 위해)
        for(int i =0; i<M;i++){
            String word = br.readLine();
            if(s1.contains(word)){
                result.add(word);
            }
        }
        
        
        StringBuilder sb = new StringBuilder();
        System.out.println(result.size());
        for(String s : result){
            sb.append(s).append("\n");
        }
        System.out.println(sb.toString());
    }
}
