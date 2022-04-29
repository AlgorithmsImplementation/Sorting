package com.search;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class LinearSearchTest {

    @Test
    public void searchTest(){
        int[] input = new int[]{1,2,3,4,5,5 ,6};

        LinearSearch linearSearch = new LinearSearch();
        assertEquals(4, linearSearch.search(input, 5));
        assertEquals(-1, linearSearch.search(input, 7));
        assertEquals(Arrays.asList(4, 5), linearSearch.searchAll(input, 5));
    }

}