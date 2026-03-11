import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        for(int i =0; i < 5; i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(Arrays.stream(nums).sum()/5);
        System.out.println(nums[2]);

    
    }
}