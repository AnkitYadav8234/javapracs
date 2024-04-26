package programs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int no,fect=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        no  = sc.nextInt();
        for(int i = 1;i<=no;i++){
            fect = fect*i;
        }
        System.out.println("Factorial is :"+fect);
    }
}
