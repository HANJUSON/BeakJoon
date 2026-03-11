import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

         if (a*e-b*d == 0){
            System.out.print("0 0");
         }
         else{
            System.out.print((c*e-b*f)/(a*e-b*d));
            System.out.print(" ");
            System.out.print((c*d-a*f)/(b*d-a*e));
         }
        

        
        scanner.close();
    }
}
