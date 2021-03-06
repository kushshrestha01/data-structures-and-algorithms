/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package code.challenges;

public class ArrayShift {
    public boolean someLibraryMethod() {
        return true;
    }

    public int[] insertShiftArray(int[] inputArr, int value) {
        float midpoint = (float) inputArr.length / 2;
        int roundedMidpoint = Math.round(midpoint);
        int[] newArray = new int[inputArr.length + 1];

        for (int i = 0; i < roundedMidpoint; i++) {
            newArray[i] = inputArr[i];
        }
        newArray[roundedMidpoint] = value;
        for (int j = inputArr.length - 1; j >= roundedMidpoint; j--) {
            newArray[j + 1] = inputArr[j];
        }
        return newArray;
    }
}
