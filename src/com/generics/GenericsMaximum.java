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
    // method takes three Float parameters and returns max of them
    static private Float maxOfThree(Float a,Float b,Float c){
        Float max=a;
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
        float a=1.1f,b=2.2f,c=3.3f;
        // max of numbers given
        System.out.println("Max of Numbers 1.1, 2.2, 3.3 is "+maxOfThree(a,b,c));
    }
}
