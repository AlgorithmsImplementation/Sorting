package com.search;

public class LinearSearch {

    public int search(int[] input, int val){
        return search(input, 0 , val);
    }

    public int search(int[] input, int index, int val){

        if(index > input.length-1){
            return -1;
        }

        if(input[index]==val){
            return index;
        }

        return search(input, index+1, val);
    }
}
