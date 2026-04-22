package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i <= nums.length; i++) {
            int req_num = target - nums[i];

            if(hm.containsKey(req_num)) {
                int[] arr = {hm.get(req_num), i};
                return arr;
            } else {
                hm.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String arg[]) {
        int[] nums = {3,2,4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
