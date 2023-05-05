package org.example.leetcode.maxvowel;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;


class MaximumNumbersOfVowelsUtilsTest {

    private MaximumNumbersOfVowelsUtils utils = new MaximumNumbersOfVowelsUtils();

    @ParameterizedTest
    @CsvSource({"abciiidef,3,3", "aeiou,2,2", "leetcode,3,2", "zpuerktejfp,3,2"})
    void shouldReturnMaximumVowelsInSubstring(String s, int k, int expectedVowels) {
        int actualMaxVowels = utils.getMaxVowelsInSubstringOfGivenString(s, k);

        assertThat(actualMaxVowels).isEqualTo(expectedVowels);
    }

}