package com.generics;

import java.awt.*;

/**
 * GenericsMaximum Class uses generics concepts
 */
public class GenericsMaximum {
    //variables
    static Integer[] n1 = {1, 2, 3, 4, 6};
    static Float[] num1 = {1.1f, 2.2f, 3.3f, 4.4f, 4375f};
    static String[] a = {"Apple", "Banana", "Peach", "Kiwi", "Grapes"};

    // parameterised constructor to find max of values in array
    public <T extends Comparable> GenericsMaximum(T[] a) {
        printMax(maxOfThree(a));
    }

    // method takes array of generic parameters and returns max of them
    static private <T extends Comparable> T maxOfThree(T[] a) {
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i].compareTo(max) > 0) {
                max = a[i];
            }
        }
        return max;
    }

    // method prints max to console
    static <T> void printMax(T max) {
        System.out.println("Max element: " + max);
    }

    // Generic methods used
    public static void main(String[] args) {
        //welcome message
        System.out.println("Generics Concepts");
        // objects of GenericsMaximum class declared and initialised
        GenericsMaximum obj1 = new GenericsMaximum(n1);
        obj1 = new GenericsMaximum(num1);
        obj1 = new GenericsMaximum(a);
    }
}
