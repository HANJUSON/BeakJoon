import java.io.*;
import java.util.*;

public class Main {
    public static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        while((input = br.readLine()) != null){
            int num = Integer.parseInt(input);
            System.out.println(new String(Cantor(num)));
        }
    }

    public static char[] Cantor(int num){
        if(num == 0){
            return new char[]{'-'};
        }
        char[] prev = Cantor(num-1);
        char[] result = new char[prev.length*3];
        for(int i=0; i<result.length; i++){
            if(i<prev.length || i>=prev.length*2){
                result[i] = prev[i%prev.length];
            }else{
                result[i] = ' ';
            }
        }
        return result;
    }
}