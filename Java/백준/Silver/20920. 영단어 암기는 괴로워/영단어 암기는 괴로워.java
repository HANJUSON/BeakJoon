import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<>();
        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            if(str.length() < M) continue;
            wordMap.put(str, wordMap.getOrDefault(str, 0) + 1);
        }

        List<String> words = new ArrayList<>(wordMap.keySet());
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 우선순위 1: 빈도수 내림차순
                if (wordMap.get(o1) != wordMap.get(o2)) {
                    return wordMap.get(o2) - wordMap.get(o1);
                }
                // 우선순위 2: 단어 길이 내림차순
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                }
                // 우선순위 3: 알파벳 사전 순 오름차순
                return o1.compareTo(o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append("\n");
        }
        System.out.print(sb);
    }
}