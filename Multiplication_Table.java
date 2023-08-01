/* Task 1: Multiplication table of any number with user input (upto 10 numbers).
Simplified steps to perform multiplication of any number are as follow:
1. Prompt the user to enter a number.
2. Read and store the number entered by the user.
3. Prompt the user to enter another number to multiply with the first number.
4. Read and store the second number entered by the user.
5. Perform the multiplication of the two numbers.
6. Display the result of the multiplication to the user.
*/

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
