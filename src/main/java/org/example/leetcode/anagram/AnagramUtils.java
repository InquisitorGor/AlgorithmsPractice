package org.example.leetcode.anagram;

import java.util.HashMap;

public class AnagramUtils {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            resultMap.put(s.charAt(i), resultMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            Integer amount = resultMap.get(t.charAt(i));
            if (amount == null) {
                return false;
            }
            amount -= 1;
            if (amount == 0) {
                resultMap.remove(t.charAt(i));
            } else {
                resultMap.put(t.charAt(i), amount);
            }
        }

        return resultMap.isEmpty();
    }
}
