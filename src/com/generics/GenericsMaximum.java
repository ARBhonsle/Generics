package com.generics;

/**
 * GenericsMaximum Class uses generics concepts
 */
public class GenericsMaximum {
    // method takes three generic parameters and returns max of them
    static private <T extends Comparable> T maxOfThree(T a,T b,T c){
        T max=a;
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
        int n1=1,n2=2,n3=3;
        float num1=1.1f,num2=2.2f,num3=3.3f;
        String a="Apple",b="Banana",c="Peach";
        // max of integer number given
        System.out.println("Max of String: 1, 2, 3 is "+maxOfThree(n1,n2,n3));
        // max of float number given
        System.out.println("Max of String: 1.1, 2.2, 3.3 is "+maxOfThree(num1,num2,num3));
        // max of parameter given
        System.out.println("Max of String: Apple, Banana, Peach is "+maxOfThree(a,b,c));
    }
}
