import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

@Slf4j
class BubbleSortTest {
    @Test
    public void sortElementsTest(){
        ArrayList unsorted = new ArrayList();
        unsorted.add(3);
        unsorted.add(5);
        unsorted.add(9);
        unsorted.add(4);
        unsorted.add(1);
        unsorted.add(7);
        unsorted.add(-1);
        unsorted.add(1);

        log.info("size {}", unsorted.size());


        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sortElements(unsorted);

        unsorted.forEach(a -> log.info(a.toString()));
    }
}