package com.my.code.javaCollection.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListCommonElements {

    static int getCommonElementCount(List<Integer> list1, List<Integer> list2) {
        System.out.println("** getCommonElementCount **");

        int count =0;
        Set<Integer> temp = new HashSet<>(list1);

        for (int i : list2) {
            if (temp.contains(i)) {
                count ++;
            }
        }
        System.out.println("temp : " +temp);
        return count;
    }

    static int getUniqueElementCount(List<Integer> list1, List<Integer> list2) {
        System.out.println("** getUniqueElementCount **");
        Set<Integer> temp = new HashSet<>(list1);

        System.out.println("temp : " +temp);

        for (int i : list2) {
            //System.out.println("i  : " +i);
            if (temp.contains(i)) {
                temp.remove(i);
                //System.out.println("removing " + i);
            }
            else {
                temp.add(i);
//                System.out.println("adding " + i);
            }
        }
        System.out.println("getUniqueElementCount : " +temp);
        return temp.size();
    }

    public static void main(String args[]) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(3,4,5,6,7,8,9,1);

        System.out.println("list1 : " +list1);
        System.out.println("list2 : " +list2);
        System.out.println("");
        System.out.println("getCommonElementCount : " +getCommonElementCount(list1, list2));
        System.out.println("");
        System.out.println("getUniqueElementCount : " +getUniqueElementCount(list1, list2));

    }
}
