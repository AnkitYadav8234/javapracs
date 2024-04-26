package programs;

import java.util.Scanner;

public class SwapNumber {

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        b = sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("The Value of A  = "+ a);
        System.out.println("The Value of B = "+b);
    }
}
