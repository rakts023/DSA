package Arrays;

public class SecondLargest {

    public static int SecondNum(int[] nums) {
        int highest = nums[0];
        int secondHighest = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > highest) {
                secondHighest = highest;
                highest = nums[i];
            } else if( nums[i] > secondHighest) {
                secondHighest = nums[i];
            }
        }
        return secondHighest;
    }

    public static void main(String[] args) {
        int[] nums = {10, 28, 9, 6, 20};
        System.out.println(SecondNum(nums));
    }
}
