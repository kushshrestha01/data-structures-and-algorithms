package com.pluralsight.calcengine;

import java.io.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
=======
        int[] inputArr = new int[]{1,2,3};
        int value = 5;
>>>>>>> d04089140eb4a7f90d4804d1c6f6996655d8d8ee
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

<<<<<<< HEAD
//        weatherData(weeklyMonthTemperatures);

        ArrayList<String> votes = new ArrayList<String>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

      tally(votes);
=======
        System.out.println((calculateAverage(inputArr)));
        System.out.println(Arrays.toString(twoDArray(weeklyMonthTemperatures)));
>>>>>>> d04089140eb4a7f90d4804d1c6f6996655d8d8ee
    }


    public static void weatherData(int[][] inputArr) {
        HashSet<Integer> array = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int i = 0; i < inputArr.length; i++) {
            for(int j = 0; j < inputArr[i].length; j++) {
                array.add(inputArr[i][j]);
            }
        }
        int max = Collections.max(array);
        int min = Collections.min(array);
        result.add(max);
        result.add(min);

        for(int i = min+1; i < max - 1; i++){
            if(!array.contains(i)){
                result.add(i);
            }
        }

        // Creating an Array
        String[] resultArray = new String[result.size()];
        result.toArray(resultArray);

        System.out.println(resultArray);
    }

    public static void tally(ArrayList<String> list) {
        HashMap<String, Integer> characterCounts = new HashMap<>();
        String[] characters = new String[]{"Bush", "Shrub", "Hedge"};
        for (String c : characters) {
            characterCounts.put(c, 0);
        }
        for (String character : list) {
            if (list.contains(character)) {
                int countSoFar = characterCounts.get(character);
                characterCounts.put(character, countSoFar + 1);
            }
        }

        String result =Collections.max(characterCounts.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(result);
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