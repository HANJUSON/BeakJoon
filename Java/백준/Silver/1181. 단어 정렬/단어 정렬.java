import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];


        for(int i =0; i<N;i++){
            arr[i] = br.readLine();
        }
        
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        String[] sortedArr = set.toArray(new String[0]);

        Arrays.sort(sortedArr, (s1, s2) -> {
            if(s1.length() != s2.length()){
                return s1.length() - s2.length();
            } else {
                return s1.compareTo(s2);
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<sortedArr.length; i++){
                sb.append(sortedArr[i]).append('\n');
        }

        System.out.print(sb.toString());
    }
    }
