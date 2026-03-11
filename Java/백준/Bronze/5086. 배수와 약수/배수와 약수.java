import java.util.*;

public class Main {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> array = new ArrayList<>();

            while(true){
                int A = scanner.nextInt();
                int B = scanner.nextInt();

                if (A == 0 && B == 0) {
                    return;
                }
                if(B%A==0){
                    System.out.println("factor");
                }
                else if(A%B==0){
                    System.out.println("multiple");
                }
                else {
                    System.out.println("neither");
                }


            }
    }
}