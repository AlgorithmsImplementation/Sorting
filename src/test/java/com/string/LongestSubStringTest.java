package com.string;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class LongestSubStringTest {

    LongestSubString longestSubString = new LongestSubString();

    @Test
    public void LongestSubStringLengthTest(){
        String input = "abcabcbb";
        log.info(String.valueOf(longestSubString.lengthOfLongestSubstring(input)));
    }
}