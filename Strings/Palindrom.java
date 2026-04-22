package Strings;

public class Palindrom {

    // public static boolean isPalindrome(String s) {
    //     String rev = "";

    //     for(int i = s.length() - 1; i >= 0; i--) {
    //         rev += s.charAt(i);
    //     }

    //     if(s.equals(rev)) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while( left < right ) {
            if( s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "moM";
        System.out.println(isPalindrome(s));

    }
}
