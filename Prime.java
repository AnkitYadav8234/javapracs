package programs;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        int no,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any number : ");
        no =  sc.nextInt();
        if(no==1)
        {
            System.out.println("The smallest Prime number is 2");
        }
        for(i = 2;i < no; i++)
        {
            if(no%i==0)
            {
                System.out.println("The number is not Prime Number");
                break;
            }
        }
        if(no==i)
        {
            System.out.println("The number is Prime Number");
        }
    }
}
