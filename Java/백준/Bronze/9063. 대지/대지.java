import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for(int i = 0; i < N; i++){
            x.add(scanner.nextInt());
            y.add(scanner.nextInt());
        }
        int x_length = Collections.max(x)-Collections.min(x);
        int y_length = Collections.max(y)-Collections.min(y);

        System.out.println(x_length*y_length);



        scanner.close();
    }
}