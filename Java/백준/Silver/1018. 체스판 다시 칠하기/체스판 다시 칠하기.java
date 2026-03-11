import java.util.Scanner;

public class Main {
    public static boolean[][] board;
    public static int min = 64;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        board = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < M; j++) {
                board[i][j] = (str.charAt(j) == 'W');
            }
        }

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    public static void find(int x, int y) {
        int count = 0;
        boolean color = board[x][y];

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (board[i][j] != color) {
                    count++;
                }
                color = (!color);
            }

            color = (!color);
        }

        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}