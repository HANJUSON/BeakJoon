import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        TreeMap<String, String> log = new TreeMap<>(); //hashmap 선언

        
        for(int i =0; i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken(); 
            String command = st.nextToken();
            if(log.containsKey(name) && command.equals("leave")) {  //log에 출입했는지 확인
                log.remove(name); //log에서 제거
            } else if(command.equals("enter")) {
                log.put(name, command);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String key : log.descendingKeySet()) {
            sb.append(key).append("\n");
        }
        System.out.print(sb);
    }
}
