import java.util.ArrayList;

/**
 * Quick sort implementation which is most widely used
 */
public class QuickSort implements Sort{
    @Override
    public ArrayList<Integer> sortElements(ArrayList<Integer> elements) {
        quickSort(elements, 0, elements.size()-1);
        return elements;
    }

    private void quickSort(ArrayList<Integer> elements, int start, int end){
        //exit condition of recursion
        if(start>=end){
            return;
        }

        //determine where we need to partition
        int partitionIndex = partition(elements, start, end);
        //recursive sorting the left part
        quickSort(elements, start, partitionIndex-1);
        //recursive sorting the right part
        quickSort(elements, partitionIndex+1, end);
    }

    /**
     * Method to identify the partition index based on the pivot
     *
     * @param elements
     * @param start
     * @param end
     * @return
     */
    private int partition(ArrayList<Integer> elements, int start, int end){

        int pivot = elements.get(end);
        int partitionIndex = start;

        for(int i = start; i < end ; i++){
            //This is to make sure all elements before pivot are less than pivot
            if(elements.get(i) <= pivot){
                swap(elements, i, partitionIndex);
                partitionIndex ++;
            }
        }
        //now swap the pivot itself
        swap(elements, partitionIndex, end);
        return partitionIndex;
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
