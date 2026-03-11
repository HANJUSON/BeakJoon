import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        while(true){
            if (N==1){
                return;
            }
            else {
                for(int i = 2; i <= N; i++){
                    if(N%i==0){
                        System.out.println(i);
                        N /= i;
                        break;
                    }
                }
            }
        }
    }
}