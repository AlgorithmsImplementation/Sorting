package com.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class SpiralMatrixTest {

    @Test
    public void spiralOrderTest(){
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[][] matrix = new int[][]{
                {1,2,3}, {4,5,6}, {7,8,9}
        };

        log.info("Spiral Order: {}", spiralMatrix.spiralOrder(matrix));
    }
}