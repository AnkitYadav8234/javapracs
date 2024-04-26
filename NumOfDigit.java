package programs;

import java.util.Scanner;

public class NumOfDigit {
    public static void main(String[] args) {
        int no,a=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        no = sc.nextInt();
        if(no<0){
            no=no*(-1);
        }
        else if (no==0) {
            no=1;
        }
        while (no>0){
            no=no/10;
            a++;

        }
        System.out.println("Number of Digit in given Number is: "+a);
    }
}
