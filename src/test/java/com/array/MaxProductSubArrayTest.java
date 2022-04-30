package com.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class MaxProductSubArrayTest {

    MaxProductSubArray maxProductSubArray = new MaxProductSubArray();

    @Test
    public void maxProductSubArrayTest(){
        int[] input = new int[]{2,3,-2,4};

        assertEquals(6, maxProductSubArray.maxProduct(input));
    }

}