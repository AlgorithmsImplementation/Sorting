package com.sorting.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GroupAnagramsTest {

    String[] unsorted = new String[] {"abc", "cba", "dfg", "gfd", "zxy", "cxb"};
    String[] sorted = new String[] {"abc", "cba", "cxb", "dfg", "gfd", "zxy"};

    @Test
    public void groupAnagramsTest(){
        GroupAnagrams anagrams = new GroupAnagrams();

        Assertions.assertArrayEquals(sorted, anagrams.groupAnagarams(unsorted));
    }

}