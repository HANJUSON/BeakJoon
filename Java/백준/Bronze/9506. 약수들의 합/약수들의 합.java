import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            int n = scanner.nextInt();

            //코드 종료
            if(n == -1){
                return;
            }

            //약수 모두 구하기
            List<Integer> array = new ArrayList<>();
            int total = 0;
            for(int i = 1; i <= n/2; i++){
                if(n%i==0){
                    array.add(i);
                    total += i;
                }
            }
            //약수의 합과 n 비교
            if(total==n){
                //출력
                System.out.print(n + " = ");
                for(int i = 0; i < array.size(); i++){
                    System.out.print(array.get(i));

                    //마지막 요소 "+" 배제
                    if(i < array.size()-1){
                        System.out.print(" + ");
                    }

                }
                System.out.println("");
            }
            //약수가 아닐때
            else{
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}