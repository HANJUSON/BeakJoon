import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String N_string = br.readLine();
        char[] N_charArray = N_string.toCharArray();
        int[] N_intArray = new int[N_charArray.length];
        for (int i = 0; i < N_charArray.length; i++) {
            N_intArray[i] = Character.getNumericValue(N_charArray[i]);
        }

        int[] count = new int[10];
        for(int num : N_intArray){
            count[num]++;
        }


        for(int i = 9; i >= 0; i--){
            for(; count[i]>0; count[i]--){
                System.out.print(i);
            }
        }
    
    }
}