package org.example.leetcode.maxvowel;

import java.util.Set;

public class MaximumNumbersOfVowelsUtils {
    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    public int getMaxVowelsInSubstringOfGivenString(String s, int k) {
        int result = 0;

        // build the window
        for (int i = 0; i < k; i++) {
            result += VOWELS.contains(s.charAt(i)) ? 1 : 0;
        }

        if (result == k) {
            return result;
        }

        int currentVowelCounter = result;
        for (int i = k; i < s.length(); i++) {
            currentVowelCounter -= VOWELS.contains(s.charAt(i - k)) ? 1 : 0;
            currentVowelCounter += VOWELS.contains(s.charAt(i)) ? 1 : 0;
            result = Math.max(currentVowelCounter, result);
        }

        return result;
    }

}
