// Task 1: Multiplication table of any number with user input (upto 10 numbers).

import java.util.Scanner;

public class Multiplication_Table
{   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=10; i++)
        {
            System.out.print("Enter 1st number: ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            int b = sc.nextInt();
            int mult = a*b;
            System.out.printf("%d X %d = %d\n", a, b, mult);
        }
    }
}