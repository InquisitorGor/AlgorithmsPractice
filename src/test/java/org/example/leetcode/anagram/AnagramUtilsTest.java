package org.example.leetcode.anagram;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AnagramUtilsTest {
    AnagramUtils utils = new AnagramUtils();

    @ParameterizedTest
    @CsvSource({"s,s", "anagram,nagaram"})
    void shouldReturnTrueIfTwoInputStringsAreAnagrams(String s, String t) {
        boolean isAnagram = utils.isAnagram(s, t);

        assertThat(isAnagram).isTrue();
    }
}