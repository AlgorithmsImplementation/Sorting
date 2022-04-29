package com.string;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class StringQuestionsTest {

    StringQuestions questions = new StringQuestions();

    @Test
    public void longestCommonPrefixTest(){
        String[] strs = new String[]{"flower","flow","flight"};
        log.info(questions.longestCommonPrefix(strs));

        String[] strs1 = new String[]{"dog","racecar","car"};
        log.info(questions.longestCommonPrefix(strs1));
    }

}