package Arrays;

import java.util.HashMap;

public class SlidingWindow {

    public static int maxNum(int[] num, int k) {
        int wSum = 0;
        int max = Integer.MIN_VALUE;

        //Window Sum
        for(int i = 0; i < k; i++) {
            wSum += num[i];
        }

        max = wSum;

        for(int i = k; i < num.length; i++) {
            wSum = wSum - num[i - k] + num[i];
            max = Math.max(max, wSum);
        }

        return max;
    }


    public static int longestSubstring(String s) {

        HashMap<Character, Integer> hm = new HashMap<>();

        int right = 0;
        int maxLen = 0;

        for(int left = 0; left < s.length(); left++) {
            char ch = s.charAt(left);

            if(hm.containsKey(ch)) {
                right = Math.max(right, hm.get(ch) + 1);
            }

            hm.put(ch, left);
            maxLen = Math.max(maxLen, left - right + 1);
        }

        return maxLen;

    }


    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int k = 3;

        System.out.println(maxNum(num, k));

        String s = "abcabcbbabcd";
        System.out.println(longestSubstring(s));
    }
}
