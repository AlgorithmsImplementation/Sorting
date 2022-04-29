package com.string;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

@Slf4j
class SubsequenceTest {

    Subsequence subsequence = new Subsequence();

    @Test
    public void subSequenceTest(){
        ArrayList<String> output = subsequence.subSequence("abc");
        output.stream().forEach(input -> {
            log.info(input);
        });

        ArrayList<String> outputAscii = subsequence.subSequenceAscii("abc");
        outputAscii.stream().forEach(input -> {
            log.info(input);
        });
    }

    @Test
    public void strStrTest(){
        subsequence.strStr("hello", "ll");
    }

}