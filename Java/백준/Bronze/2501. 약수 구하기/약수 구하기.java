import java.util.*;

public class Main {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int i = 1;
            int count = 0;
            while(true){
                if(i>N){
                    System.out.print(0);
                    return;
                }


                if(N%i==0){
                    count++;
                    if(count==K){
                        System.out.print(i);
                        return;
                    }
                }
                i++;
        }
    }
}