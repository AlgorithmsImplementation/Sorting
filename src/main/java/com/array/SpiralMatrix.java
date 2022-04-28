package com.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<>();

        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        int topIndex = 0;
        int bottomIndex = rowLength-1;
        int leftIndex = 0;
        int rightIndex = colLength-1;
        int direction=0;

        // 0 - right
        // 1 - down
        // 2 - left
        // 3- up


        while(topIndex <= bottomIndex && leftIndex <= rightIndex){
            if(direction==0){
                for(int i=leftIndex; i<=rightIndex; i++ ){
                    output.add(matrix[topIndex][i]);
                }
                topIndex++;
            }else if(direction == 1){
                for(int i=topIndex; i<=bottomIndex; i++ ){
                    output.add(matrix[i][rightIndex]);
                }
                rightIndex--;
            }else if(direction == 2){
                for(int i=rightIndex; i>= leftIndex; i--){
                    output.add(matrix[bottomIndex][i]);
                }
                bottomIndex--;
            }else if(direction == 3){
                for(int i=bottomIndex; i>= topIndex; i--){
                    output.add(matrix[i][leftIndex]);
                }
                leftIndex++;
            }

            direction = (direction+1)%4;
        }

        return output;
    }
}
