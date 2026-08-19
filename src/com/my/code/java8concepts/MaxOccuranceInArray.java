package com.my.code.java8concepts;

import java.util.HashMap;
import java.util.Map;

public class MaxOccuranceInArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 2, 1, 3, 2, 1, 3};

        Map<Integer, Integer> arrFreq = new HashMap<>();

        for (int num : arr) {
            arrFreq.put(num, arrFreq.getOrDefault(num, 0) + 1);
        }

        int maxNum = 0;
        int maxCount = -1;

        for(Map.Entry<Integer, Integer> temp : arrFreq.entrySet()) {
            if (temp.getValue() > maxNum) {
                maxNum = temp.getKey();
                maxCount = temp.getValue();;
            }
        }

        System.out.println("max number :" + maxNum);
        System.out.println("max Count : " + maxCount);
    }
}
