package com.swap;

public class SwapUsingThirdVariable {
    public static void main(String[] args) {
        int a= 10,b=20;
        int temp;

        System.out.println("Before swapping values are : "+a+" "+b );

        temp=a;
        a=b;
        b=temp;

        System.out.println("After swapping values are : "+a+" "+b );

    }


}
