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
        HashSet<Integer> A = new HashSet<>(); //hashset 선언
        HashSet<Integer> B = new HashSet<>(); //hashset 선언

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<N;i++){
            A.add(Integer.parseInt(st2.nextToken())); //hashset에 값 추가
        }
        StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<M;i++){
            B.add(Integer.parseInt(st3.nextToken())); //hashset에 값 추가
        }
        
        HashSet<Integer> intersectionSet = new HashSet<>(A); //교집합
        intersectionSet.retainAll(B);

        int result = (A.size() - intersectionSet.size()) + (B.size() - intersectionSet.size()); //합집합 - 교집합*2
        System.out.println(result);
    }
}
