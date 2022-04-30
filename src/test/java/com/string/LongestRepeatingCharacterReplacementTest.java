package com.string;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class LongestRepeatingCharacterReplacementTest {

    LongestRepeatingCharacterReplacement longestRepeatingCharacter = new LongestRepeatingCharacterReplacement();
    @Test
    public void characterReplacementTest(){
        String input = "AABABBA";
        log.info(String.valueOf(longestRepeatingCharacter.characterReplacement(input, 1)));
    }
}