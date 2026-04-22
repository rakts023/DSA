package Strings;

import java.util.HashSet;

public class RemoveDuplicate {

    public static String duplicateChar(String s) {
        HashSet<Character> hs = new HashSet<>();
        StringBuilder result = new StringBuilder();


        for(char ch : s.toCharArray()) {
            if(!hs.contains(ch)) {
                hs.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "banana";
        System.out.println(duplicateChar(s));
    }
}
