package com.sorting.problems;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class SortedMergeTest {

    @Test
    public void testSortedMerge(){
        int[] a = {1,5, 7, 0, 0, 0};

        int[] b = {-1, 2, 3};

        SortedMerge sortedMerge = new SortedMerge();

        int[] c = sortedMerge.mergeSorted(a, b);

        Assertions.assertArrayEquals(new int[]{-1, 1, 2, 3, 5, 7}, c);
    }
}