package programs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int no, rev=0,rem,Og;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        no = sc.nextInt();
        Og=no;
        while (no>0)
        {
            rem = no%10;
            rev = rev*10+rem;
            no = no/10;
        }
        System.out.println("The Reverse Number is : "+rev);
    }
}
