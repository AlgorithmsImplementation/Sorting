package com.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public List<Integer> searchAll(int[] input, int val){
        List<Integer> occurrences = new ArrayList<>();
//        searchAll(input,0, val, occurrences);
        return searchAll(input, 0, val);

//        return occurrences;
    }

    public void searchAll(int[] input, int index, int val, List<Integer> occurrences){

        if(index > input.length-1){
            return;
        }

        if(input[index]==val){
            occurrences.add(index);
        }

        searchAll(input, index+1, val, occurrences);
    }

    public List<Integer> searchAll(int[] input, int index, int val){

        List<Integer> output = new ArrayList<>();
        if(index > input.length-1){
            return output;
        }

        if(input[index]==val){
            output.add(index);
        }

        output.addAll(searchAll(input, index+1, val));

        return output;
    }
}
