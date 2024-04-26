package programs;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int no, rev=0,rem,Og;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        no = sc.nextInt();
        Og=no;
        while (no>0)
        {
            rem = no%10;
            no = no/10;
            rev = rev+rem*rem*rem;
        }
        if(rev==Og)
        {
            System.out.println("The is Armstrong");
        }
        else {
            System.out.println("The number is not armstrong");

        }
    }

}
