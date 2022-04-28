package com.array;

public class ArrayQuestions {

    public boolean isArraySorted(int[] input){
        return isArraySorted(input, 0);
    }

    private boolean isArraySorted(int[] input , int index){
        if(index == input.length -1 ){
            return true;
        }

        return input[index] > input[index+1] && isArraySorted(input, index+1);
    }
}
