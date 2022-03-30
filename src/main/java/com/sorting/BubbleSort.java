package com.sorting;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * Bubble sort implementation for arraylist
 * Worst case and average case complexity is o(n2)
 */
@Slf4j
public class BubbleSort implements Sort{

    @Override
    public ArrayList<Integer> sortElements(ArrayList<Integer> elements) {

        for(int pass = 1 ; pass < elements.size(); pass ++){
            //After each pass we are sorting the last element in the list
            //We can optimize by skipping those elements in the next pass
            boolean alreadySorted = true;
            for(int i = 0 ; i < elements.size() - pass; i++ ){
                if (elements.get(i) > elements.get(i+1)){
                    //we can further optimize here by checking if there is any swap if there are no swaps
                    // that means the array is already sorted
                    swap(elements, i , i+1);
                    alreadySorted = false;
                }
            }

            log.info("Pass {}", pass);

            if(alreadySorted) {
                break;
            }
        }

        return elements;
    }

    /**
     * Swap the position of the elements
     *
     * @param elements
     * @param leftPos
     * @param rightPos
     */
    private void swap(ArrayList<Integer> elements, int leftPos, int rightPos){
        int leftVal = elements.get(leftPos);
        int rightVal = elements.get(rightPos);

        elements.set(leftPos, rightVal);
        elements.set(rightPos, leftVal);
    }
}
