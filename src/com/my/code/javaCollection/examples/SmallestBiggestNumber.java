package com.my.code.javaCollection.examples;

public class SmallestBiggestNumber {

    public static void main(String[] args) {

        int[] numbers = {-5, 2, 9, 1, -7};

        int smallest = numbers[0];
        int smaller = numbers[0];
        int biggest = numbers[0];
        for (int num : numbers) {
            if (smallest > num) {
                smaller = smallest;
                smallest = num;
            }
            if (biggest < num) {
                biggest = num;
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Second smallest number: " + smaller);
        System.out.println("Biggest number: " + biggest);
    }
}
