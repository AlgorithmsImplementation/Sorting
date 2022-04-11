package com.search;

import java.util.ArrayList;

public class BinarySearch {

    public int search(ArrayList<Integer> input, Integer searchElement){
        int start = 0;
        int end = input.size()-1;

        while(start<=end){
            int mid = (start + end)/2;

            Integer midElement = input.get(mid);
            if (midElement.equals(searchElement)){
                return mid;
            }

            if(midElement < searchElement){
                start = mid+1;
            }

            if(midElement > searchElement){
                end = mid-1;
            }
        }
        return -1;
    }

    public int recursiveSearch(ArrayList<Integer> input, int start, int end , Integer searchElement){
        int mid = (start+end)/2;

        Integer midElement = input.get(mid);

        //exit condition
        if(start> end){
            return -1;
        }

        if(midElement.equals(searchElement)){
            return mid;
        }

        if(midElement < searchElement){
            return recursiveSearch(input, mid+1, end, searchElement);
        }else{
            return recursiveSearch(input, start, mid-1, searchElement);
        }
    }
}
