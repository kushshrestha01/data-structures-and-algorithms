package com.pluralsight.calcengine;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] inputArr = new int[]{2,4,6,8};
        int value = 5;
        double midpoint = (double) inputArr.length/ 2;
        int roundedMidpoint = (int)(Math.round(midpoint));
        System.out.println(roundedMidpoint);
        System.out.println(Arrays.toString(insertShiftArray(inputArr, value)));
    }

    public static int[] insertShiftArray(int[] inputArr, int value) {
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