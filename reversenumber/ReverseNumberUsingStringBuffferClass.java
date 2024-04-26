package com.reversenumber;

import java.util.Scanner;

public class ReverseNumberUsingStringBuffferClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eneter a Number");
        int num = scanner.nextInt();

        StringBuffer reverse = new StringBuffer(String.valueOf(num)).reverse();
        System.out.println("ReverseNumber is: "+ reverse);


    }
}
