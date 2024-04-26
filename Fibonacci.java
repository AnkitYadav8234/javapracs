package programs;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int i,no,first,second,next;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        no = sc.nextInt();
        first = 0;
        second = 1;
        System.out.println("Fibonaci Series are :  ");
        for(i = 0; i<no;i++)
        {
            System.out.println(first);
            next = first + second;
            first = second;
            second = next;
        }

    }
}
