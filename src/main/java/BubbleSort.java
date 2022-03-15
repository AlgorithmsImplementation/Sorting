import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * Bubble sort implementation for arraylist
 */
@Slf4j
public class BubbleSort implements Sort{

    @Override
    public ArrayList<Integer> sortElements(ArrayList<Integer> elements) {

        for(int pass = 1 ; pass < elements.size(); pass ++){
            //After each pass we are sorting the last element in the list
            //We can optimize by skipping those elements in the next pass
            for(int i = 0 ; i < elements.size()-pass; i++ ){
                if (elements.get(i) > elements.get(i+1)){
                    swap(elements, i , i+1);
                }
            }
            log.info("pass" + pass);
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
