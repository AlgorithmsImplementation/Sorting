import java.util.ArrayList;

public class MergeSort implements Sort{
    @Override
    public ArrayList<Integer> sortElements(ArrayList<Integer> elements) {
        mergeSort(elements);
        return elements;
    }

    /**
     * Recursive merge
     *
     * @param elements
     */
    private void mergeSort(ArrayList<Integer> elements){
        int length = elements.size();

        //the array has only one element and is sorted so doesn't require further splits
        if(length < 2) {
            return;
        }

        //Let's split the array into two halves
        int mid = length/2;
        ArrayList<Integer> leftArray = new ArrayList<>();
        ArrayList<Integer> rightArray = new ArrayList<>();

        //Copy the elements to left from o to mid-1
        //Copy the elements to right from mid to length-1;
        for(int i = 0; i < mid; i++){
            leftArray.add(elements.get(i));
        }

        for(int i = mid; i< length; i++){
            rightArray.add(elements.get(i));
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, elements);
    }

    /**
     * Merge the sorted arrays
     *
     * @param leftArray
     * @param rightArray
     * @param elements
     */
    private void merge(ArrayList<Integer> leftArray, ArrayList<Integer> rightArray, ArrayList<Integer> elements){
        int leftLength = leftArray.size();
        int rightLength = rightArray.size();

        int i = 0;
        int j = 0;
        int k = 0;

        while(i< leftLength && j < rightLength){
            if(leftArray.get(i) <= rightArray.get(j)){
                elements.set(k, leftArray.get(i));
                i++;
            }else {
                elements.set(k, rightArray.get(j));
                j++;
            }
            k++;
        }

        //After we do this there might be left over's in the left or right array
        //left array leftOvers
        while(i < leftLength){
            elements.set(k, leftArray.get(i));
            i++;
            k++;
        }
        //right array leftOvers
        while(j< rightLength){
            elements.set(k, rightArray.get(j));
            j++;
            k++;
        }
    }
}
