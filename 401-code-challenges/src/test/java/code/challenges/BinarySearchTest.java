package code.challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testSomeLibraryMethod() {
        BinarySearch classUnderTest = new BinarySearch();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test
    public void testBinaryMethod() {
        BinarySearch classUnderTest = new BinarySearch();
        int arr[] = {4, 8, 15, 16, 23, 42};
        int x = 16;
        int expectedOutput = 3;
        assertEquals("someLibraryMethod should return 'true'", expectedOutput,  classUnderTest.BinarySearch(arr, x));
    }

    @Test
    public void testBinaryMethodSecond() {
        BinarySearch classUnderTest = new BinarySearch();
        int arr[] = {11,22,33,44,55,66,77};
        int x = 90;
        int expectedOutput = -1;
        assertEquals("someLibraryMethod should return 'true'", expectedOutput,  classUnderTest.BinarySearch(arr, x));
    }

}