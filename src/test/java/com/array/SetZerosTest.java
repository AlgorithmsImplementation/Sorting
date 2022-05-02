package com.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@Slf4j
class SetZerosTest {

    SetZeros setZeros = new SetZeros();

    @Test
    public void setZerosTest(){

        int[][] matrix = new int[][]{
                {1,0,3}
        };

        setZeros.setZeroes(matrix);

        log.info(Arrays.toString(matrix));
    }

}