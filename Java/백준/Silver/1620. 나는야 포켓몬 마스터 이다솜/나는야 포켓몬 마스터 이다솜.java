import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<Integer, String> pocketMon = new HashMap<>(); //hashmap 선언
        HashMap<String, Integer> reversePocketMon = new HashMap<>(); //이름으로 번호 찾기용 해쉬맵

        int index = 1;
        for(int i =0; i<N;i++){
            pocketMon.put(index, br.readLine());
            reversePocketMon.put(pocketMon.get(index), index);
            index++;
        }

        for(int i = 0; i<M;i++){
            String command = br.readLine();
            if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
                int num = Integer.parseInt(command);
                System.out.println(pocketMon.get(num));
            } else {
                System.out.println(reversePocketMon.get(command));
            }
        }
    }
}
