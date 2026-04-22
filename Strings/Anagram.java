package Strings;

import java.util.HashMap;

public class Anagram {

    public static boolean isAnagram(String s1, String s2) {

        if(s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

         // Step 1: count s1
        for(int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }


         // Step 2: subtract using t
         for(int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);

            if(!hm.containsKey(ch)) {
                return false;
            }

            hm.put(ch, hm.get(ch) - 1);

            if(hm.get(ch) == 0) {
                hm.remove(ch);
            } 
         }

         return hm.isEmpty();

    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println(isAnagram(s1, s2));
    }
}
