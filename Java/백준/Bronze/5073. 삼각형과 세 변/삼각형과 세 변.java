import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            //종료
            if(a == 0 || b == 0 || c == 0) break;
            //삼각형 아님
            else if(a >= b+c || b >= a+c || c >= a+b) System.out.println("Invalid");
            //정삼각형
            else if(a==b && b==c) System.out.println("Equilateral");
            //이등변삼각형
            else if(a==b || b==c || a==c) System.out.println("Isosceles");
            //그냥 삼각형
            else System.out.println("Scalene");
        }
    }
}