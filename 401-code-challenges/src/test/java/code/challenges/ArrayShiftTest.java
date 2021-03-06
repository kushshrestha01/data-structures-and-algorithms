/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package code.challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test
    public void testInsertShiftArray() {
        ArrayShift classUnderTest = new ArrayShift();
        int[] inputArr = new int[]{4,8,15,23,42};
        int value = 16;
        int[] expectedOutput = new int[]{4,8,15,16,23,42};
        assertArrayEquals("adding a value in the midpoint",
                expectedOutput,
                classUnderTest.insertShiftArray(inputArr, value));
    }

    @Test
    public void testInsertShiftArrayEven() {
        ArrayShift classUnderTest = new ArrayShift();
        int[] inputArr = new int[]{2,4,6,8};
        int value = 5;
        int[] expectedOutput = new int[]{2,4,5,6,8};
        assertArrayEquals("adding a value in the midpoint",
                expectedOutput,
                classUnderTest.insertShiftArray(inputArr, value));
    }

}
