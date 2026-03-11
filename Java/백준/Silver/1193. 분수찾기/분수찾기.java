import java.util.Scanner;

public class Main {
    public static void calculator(int N) {
        if (N == 1) {
            System.out.print("1/1");
            return;
        }

        int total = 2;
        int count = 0;

        while (true) {
            if (total % 2 == 0) {
                int numerator = total - 1;
                int denominator = 1;
                for (int i = 0; i < total - 1; i++) {
                    count++;
                    if (count == N) {
                        System.out.print(numerator + "/" + denominator);
                        return;
                    }
                    numerator--;
                    denominator++;
                }
            } 

            else {
                int numerator = 1;
                int denominator = total - 1;
                for (int i = 0; i < total - 1; i++) {
                    count++;
                    if (count == N) {
                        System.out.print(numerator + "/" + denominator);
                        return;
                    }
                    numerator++;
                    denominator--;
                }
            }
            total++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int N = sc.nextInt();
            calculator(N);
        }
        sc.close();
    }
}