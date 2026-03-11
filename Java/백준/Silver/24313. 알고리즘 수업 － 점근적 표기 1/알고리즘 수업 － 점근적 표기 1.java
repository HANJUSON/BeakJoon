import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a1 = scanner.nextInt();
        int a0 = scanner.nextInt();
        int c = scanner.nextInt();
        int n0 = scanner.nextInt();
        
        // 1. f(n0)의 값 계산
        int fn0 = a1 * n0 + a0;
        

        if (fn0 <= c * n0 && a1 <= c) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        scanner.close();
    }
}