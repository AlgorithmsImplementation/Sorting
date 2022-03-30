package com.sorting;

import java.util.ArrayList;

public class InsertionSort implements Sort{
    @Override
    public ArrayList<Integer> sortElements(ArrayList<Integer> elements) {
        int size = elements.size();

        for(int i = 1; i< size ; i ++){
            int value = elements.get(i);
            int sortedPosition = i;

            while(sortedPosition > 0 && elements.get(sortedPosition-1) > value){
                //insert the value at right position
                //we basically shift the elements
                //at any point in time the left part of the array will be sorted
                elements.set(sortedPosition, elements.get(sortedPosition -1));
                sortedPosition--;
            }

            elements.set(sortedPosition, value);
        }

        return elements;
    }
}
