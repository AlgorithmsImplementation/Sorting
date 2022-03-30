package com.sorting;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * Selection sort basically do a linear scan and move the element to the first
 */
@Slf4j
public class SelectionSort implements Sort{
    @Override
    public ArrayList<Integer> sortElements(ArrayList<Integer> elements) {

        for(int pass = 1; pass < elements.size() ; pass ++) {
            //in the first pass we will sort the first element
            int minPos = pass-1;
            for(int i = pass-1 ; i < elements.size() ; i++){
                if(elements.get(i) < elements.get(minPos)){
                    minPos = i;
                }
            }

            log.info("Pass {}", pass);

            int temp = elements.get(pass-1);
            elements.set(pass-1, elements.get(minPos));
            elements.set(minPos, temp);
        }
        return elements;
    }
}
