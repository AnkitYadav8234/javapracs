package programs;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        no = sc.nextInt();
        if(no%2==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
