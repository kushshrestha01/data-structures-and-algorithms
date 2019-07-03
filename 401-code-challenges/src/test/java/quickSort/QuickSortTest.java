package quickSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void testQuickSort(){
        QuickSort test = new QuickSort();
        int[] arr = {1, 3, 2, 6, 4, 2143, 234, 10};
        int n = arr.length;
        int[] expectedOutput = {1, 2, 4, 3, 6, 10, 234, 2143};
        int[] output = test.quickSort(arr,0, n-1);
        assertArrayEquals("Checking if the method sorts the array",
                expectedOutput,
                output);

    }

    @Test (expected=NullPointerException.class)
    public void testEmptyArrray(){
        QuickSort test = new QuickSort();
        int[] arr = {};
        test.quickSort(arr,0,arr.length);
    }

}