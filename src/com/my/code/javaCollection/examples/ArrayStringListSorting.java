package com.my.code.javaCollection.examples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayStringListSorting {

    /*
    input :
        [
            [nat],
            [tat, sat, mat],
            [cat, bat]
        ]
    output :
        [
            [nat],
            [bat, cat]
            [mat, sat, tat ]
        ]
     */
    public static void main(String args[]) {
        List<String[]> list1 = Arrays.asList(new String[]{"nat"}, new String[]{"tat", "sat", "mat"}, new String[]{"cat", "bat"});

        System.out.println("before sorting list1 : " + list1);
        list1.forEach(arrList -> System.out.println("arrList : " + Arrays.toString(arrList)));

        for (String[] arrList : list1){
            if (arrList.length > 1) {
                Arrays.sort(arrList);
            }
        }

        //Arrays.sort(list1.toArray(), (a, b) -> Integer.compare(((String[]) a).length, ((String[]) b).length));
        list1.sort(
                Comparator.comparingInt(arrList -> ((String[]) arrList).length)
        );
        System.out.println("after sorting list1 : " + list1);
        list1.forEach(arrList -> System.out.println("arrList : " + Arrays.toString(arrList)));

    }
}
