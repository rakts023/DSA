package Strings;

import java.util.HashMap;

public class NonRepeating {

    public static char repetingChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for(char ch : s.toCharArray()) {
            if(hm.get(ch) == 1){
                return ch; 
            }
        }

        return '_';

    }

    public static void main(String[] args) {
        String s = "aabbcde";
        System.out.println(repetingChar(s));
    }
}
