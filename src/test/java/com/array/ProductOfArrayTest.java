package com.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@Slf4j
class ProductOfArrayTest {
    ProductOfArray productOfArray = new ProductOfArray();

    @Test
    public void productExceptSelfTest(){
        int[] nums = new int[]{1, 2, 3, 4};
        int[] output = productOfArray.productExceptSelf(nums);

        log.info(Arrays.toString(output));
    }
}