package Arrays;

public class Create {
    public static void main(String args[]) {

        int[] nums = {2, 4, 6, 8, 10};
        int sum = 0;

        for(int i = 0; i <= nums.length - 1; i++) {
            sum += nums[i];
        }
        System.out.print(sum);

    }
}


//Array is static