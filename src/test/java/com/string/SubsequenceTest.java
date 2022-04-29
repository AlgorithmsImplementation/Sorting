package com.string;

import org.junit.jupiter.api.Test;

class SubsequenceTest {

    Subsequence subsequence = new Subsequence();

    @Test
    public void subSequenceTest(){
        subsequence.subSequence("abc");
    }

    @Test
    public void strStrTest(){
        subsequence.strStr("hello", "ll");
    }

}