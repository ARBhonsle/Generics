package com.generics;

/**
 * GenericsMaximum Class uses generics concepts
 */
public class GenericsMaximum {
    // method takes three Integer parameters and returns max of them
    static private Integer maxOfThree(Integer a,Integer b,Integer c){
        Integer max=a;
        if(b.compareTo(max)>0 ){
            max= b;
        }
        if(c.compareTo(max)>0 ){
            max= c;
        }
        return max;
    }

    // Generic methods used
    public static void main(String[] args) {
        //welcome message
        System.out.println("Generics");
        //variables
        int a=1,b=2,c=3;
        // max of numbers given
        System.out.println("Max of Numbers 1, 2, 3 is "+maxOfThree(a,b,c));
    }
}
