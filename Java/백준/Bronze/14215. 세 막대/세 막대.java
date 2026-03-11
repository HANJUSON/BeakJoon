import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a >= b+c) a = b+c -1;
        else if(b >= a+c) b = a+c-1;
        else if(c >= a+b) c = a+b-1;

        System.out.println(a+b+c);

    }
}