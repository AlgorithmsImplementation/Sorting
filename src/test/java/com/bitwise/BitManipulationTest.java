package com.bitwise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BitManipulationTest {


    BitManipulation bitManipulation = new BitManipulation();

    @Test
    public void isOddEvenTest(){
        assertEquals(false, bitManipulation.isOdd(6));
        assertEquals(true, bitManipulation.isOdd(7));
    }

    @Test
    public void findUnique(){
        assertEquals(4, bitManipulation.findUnique(new int[]{1 , 2 , 3, 4, 3, 2, 1}));
    }

    @Test
    public void findBitTest(){
        assertEquals(0, bitManipulation.findBit(10, 2));
    }

    @Test
    public void findMagicNumberTest(){
        assertEquals(130, bitManipulation.findMagicNumber(5));
    }

    @Test
    public void findDigits(){
        assertEquals(4, bitManipulation.noOfDigits(8, 2));
        assertEquals(5, bitManipulation.noOfDigits(12345, 10));
    }

    @Test
    public void isPow2Test(){
        assertEquals(true, bitManipulation.isPow2(8));
        assertEquals(false, bitManipulation.isPow2(9));
    }

    @Test
    public void powTest(){
        assertEquals(4, bitManipulation.pow(2, 2));
    }

}