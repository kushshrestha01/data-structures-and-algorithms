package mergeSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        MergeSort test = new MergeSort();
        int[] arr = {1,3,2,4,656,5};
        int[] expectedOutput = {1,2,3,4,5,656};
        assertArrayEquals("Checking the merge sort function",
                expectedOutput,
                test.mergeSort(arr));
    }


}