package Arrays;

public class RemoveZero {

    public static void removeZero(int[] nums) {
        int count = 0;

        for(int i = 0; i <= nums.length - 1; i++) {
            if(nums[i] != 0) {
                nums[count] = nums[i];
                count++;
            }
        }

        while ( count < nums.length - 1) {
            nums[count] = 0;
            count++;
        }
    }

    public static void main(String args[]) {
        int[] nums = {0,2,4,0,6,8,0};

        removeZero(nums);
        for(int i = 0; i <= nums.length - 1; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
