package com.my.code.java8concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class MyComparable implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) return -1;
        else if (o1 > o2) return +1 ;
        else
        return 0;
    }
}

public class LambdaComparableTest {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        Collections.addAll(arrayList1, 8,6,10,4,7,2,1);
        System.out.println("original : " +  arrayList1);
        //Collections.sort(arrayList1, new MyComparable());
        Comparator<Integer> myC =  (o1, o2) -> (o1 < o2) ? -1: ( (o1 > o2) ? 1: 0);
        Collections.sort(arrayList1, myC);
        System.out.println("sorted : " +  arrayList1);
    }
}
