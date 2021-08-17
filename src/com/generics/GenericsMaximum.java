package com.generics;

import java.awt.*;

/**
 * GenericsMaximum Class uses generics concepts
 */
public class GenericsMaximum {
    //variables
    static int n1 = 1, n2 = 2, n3 = 3;
    static float num1 = 1.1f, num2 = 2.2f, num3 = 3.3f;
    static String a = "Apple", b = "Banana", c = "Peach";

    // parameterised constructer to find max of three
    public <T extends Comparable> GenericsMaximum(T a, T b, T c) {
        System.out.println("Parameters passed are: " + a + " " + b + " " + c);
        maxOfThree(a, b, c);
    }

    // method takes three generic parameters and returns max of them
    static private <T extends Comparable> void maxOfThree(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println(max);
    }

    // Generic methods used
    public static void main(String[] args) {
        //welcome message
        System.out.println("Generics");
        // objects of GenericsMaximum class declared and initialised
        GenericsMaximum obj1 = new GenericsMaximum(n1, n2, n3);
        obj1 = new GenericsMaximum(num1, num2, num3);
        obj1 = new GenericsMaximum(a, b, c);
    }
}
