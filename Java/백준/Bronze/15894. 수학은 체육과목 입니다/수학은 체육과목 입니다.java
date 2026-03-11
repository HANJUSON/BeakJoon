import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Long n = scanner.nextLong();
        System.out.print(n * 4);

        scanner.close();
    }
}