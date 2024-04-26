package com.reversestring;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eneter a String");
        String num = scanner.next();

        String rev="" ;
        char[] charArray = num.toCharArray();
        for (int i = charArray.length-1; i >=0; i--) {
            rev= rev+charArray[i];
        }
        System.out.println("The Reverse string is : "+ rev);
    }
    //Type 2. We can use charAt() method of string. for other method
    //Type 3. We can use StringBuffer inbuilt reverse method.

}
