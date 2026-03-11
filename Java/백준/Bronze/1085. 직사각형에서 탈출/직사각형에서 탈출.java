import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int result = x;
        if(result>w-x){
            result = w-x;
        }
        if(result>y){
            result = y;
        }
        if(result>h-y){
            result = h-y;
        }

        System.out.println(result);
    }
}