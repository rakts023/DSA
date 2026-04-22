package Strings;

import java.util.HashMap;

public class WordFrequency {

    public static void frequency(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(hm.containsKey(ch)) {
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        
        System.out.println(hm);
        }

    public static void main(String[] args) {
        String s = "programming";
        frequency(s);
    }
    
}
