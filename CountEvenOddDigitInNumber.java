package com;

import java.util.Scanner;

public class CountEvenOddDigitInNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Eneter a Number");
        int num = scanner.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        while (num>0){
            int rem = num % 10;
            if (rem%2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }
            num = num / 10;
        }
        System.out.println("Total Even Number is : "+evenCount);
        System.out.println("Total Odd Number is : "+oddCount);
    }
}
