package com.search;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class LinearSearchTest {

    @Test
    public void searchTest(){
        int[] input = new int[]{1,2,3,4,5,6};

        LinearSearch linearSearch = new LinearSearch();
        assertEquals(4, linearSearch.search(input, 5));
    }

}