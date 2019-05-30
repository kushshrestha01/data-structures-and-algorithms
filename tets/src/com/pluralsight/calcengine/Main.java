package com.pluralsight.calcengine;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] inputArr = new int[]{1,2,3};
        int value = 5;
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        System.out.println((calculateAverage(inputArr)));
        System.out.println(Arrays.toString(twoDArray(weeklyMonthTemperatures)));
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

    public static double calculateAverage(int[] inputArr) {
        double sum = 0;
        for(int i = 0; i < inputArr.length; i++) {
            sum += inputArr[i];
        }
        double average =  sum/(double)inputArr.length;
        return average;
    }

    public static int [] twoDArray(int[][] inputArr) {
        double currentAverage = 0;
        double previousAverage = 0;
        int[] resultArray = {};
        boolean firstTime = true;

        for(int i = 0; i < inputArr.length; i++) {
            currentAverage = calculateAverage(inputArr[i]);
            if(firstTime){
                previousAverage = currentAverage;
                resultArray = inputArr[i];
                firstTime = false;
            }

            if(currentAverage < previousAverage){
                resultArray = inputArr[i];
                previousAverage = currentAverage;
            }
        }
        return resultArray;
    }



}