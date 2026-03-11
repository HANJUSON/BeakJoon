import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        int[] X = new int[N];
        int[] sorted = new int[N];    // 정렬용 배열

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<N;i++){
            X[i] = Integer.parseInt(st.nextToken());
            sorted[i] = X[i];
        }

        //sorted 배열 정렬
        Arrays.sort(sorted);

        //중복값 제거
        Map<Integer, Integer> rankingMap = new HashMap<>();

        //배열 순서대로 등수 매기기
        int rank = 0;
        for(int v : sorted) {
            // 정렬된 상태에서 처음 나오는 숫자만 순위를 매김
            if(!rankingMap.containsKey(v)) {
                rankingMap.put(v, rank);
                rank++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<X.length; i++){
                sb.append(rankingMap.get(X[i])).append(' ');
        }

        System.out.print(sb.toString());
    }
    }
