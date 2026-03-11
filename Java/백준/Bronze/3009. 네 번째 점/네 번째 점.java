import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt(), y1 = scanner.nextInt();
        int x2 = scanner.nextInt(), y2 = scanner.nextInt();
        int x3 = scanner.nextInt(), y3 = scanner.nextInt();

        int resX = x1 ^ x2 ^ x3;
        int resY = y1 ^ y2 ^ y3;

        System.out.println(resX + " " + resY);
        
        scanner.close();
    }
}