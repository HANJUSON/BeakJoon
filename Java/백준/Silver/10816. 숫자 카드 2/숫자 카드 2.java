import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> s1 = new HashMap<>(); //hashmap 선언



        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<N;i++){
            int num = Integer.parseInt(st.nextToken());
            if(s1.containsKey(num)){
                s1.put(num, s1.get(num) + 1); //이미 존재하면 값 증가
            } else {
                s1.put(num, 1); //존재하지 않으면 1로 초기화
            }
        }

        int M = Integer.parseInt(br.readLine());
        int[] s2 = new int[M]; //배열

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<M;i++){
            s2[i] = Integer.parseInt(st2.nextToken()); //배열에 값 추가
        }
        
        
        StringBuilder sb = new StringBuilder();
        for(int num : s2){
            sb.append(s1.getOrDefault(num, 0)).append(" ");
        }

        System.out.print(sb.toString());
    }
}
