package com.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {
    Recursion recursion = new Recursion();

    @Test
    public void findSumTest(){
        assertEquals(6, recursion.findSum(123));
    }

    @Test
    public void reverse(){
        assertEquals(321, recursion.reverseInteger(123));
        assertEquals(-321, recursion.reverseInteger(-123));

        assertEquals(-321, recursion.reverse(-123));

    }

    @Test
    public void countZeros(){
        assertEquals(3, recursion.zeroCount(3000));
    }

}