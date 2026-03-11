import java.io.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            StringBuilder sentense = new StringBuilder(br.readLine());
            

            for (int i = 0; i < sentense.length(); i++) {
                if (sentense.charAt(i) == '(') {
                    int lastparentheses = sentense.indexOf(")", i);
                    if (lastparentheses == -1) {
                        System.out.println("NO");
                        break;
                    }
                    sentense.deleteCharAt(lastparentheses);
                    sentense.deleteCharAt(i);
                    i--;
                    if (i == sentense.length() - 1) {
                    System.out.println("YES");
                }
                }
                else if (sentense.charAt(i) == ')') {
                    System.out.println("NO");
                    break;
                }
                
                
            }  
        }
    }
}