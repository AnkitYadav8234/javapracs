package com;

import java.util.Scanner;

public class CountDigitOfNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Eneter a Number :");
        int num = scanner.nextInt();

        int count = 0;
        while (num>0){
            num = num /10;
            count++;
        }
        System.out.println("Total Number of digits : "+count);
    }
}
