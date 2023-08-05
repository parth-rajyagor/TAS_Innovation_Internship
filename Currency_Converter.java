/* Task 2: Currency Converter
Simplified steps to create a currency converter in Java:
1. Prompt the user to enter the amount to be converted.
2. Read and store the amount entered by the user.
3. Prompt the user to enter the source currency.
4. Read and store the source currency entered by the user.
5. Prompt the user to enter the target currency.
6. Read and store the target currency entered by the user.
7. Fetch the exchange rate for the source and target currencies from an API or a predefined currency conversion formula.
8. Multiply the amount by the exchange rate to perform the currency conversion.
9. Display the converted amount to the user.
*/

import java.util.Scanner;

public class Currency_Converter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double total;
        System.out.print("Enter the amount to be converted: ");
        double a = sc.nextDouble();
        System.out.print("Enter the Source Currency: ");
        switch(sc.next())
        {
            case "USD":
                System.out.print("Enter the Target Currency: ");
                switch(sc.next())
                {
                    case "INR":
                        total=a*82.743;
                        System.out.println(a + " USD = "+total+" INR");
                        break;
                    case "EUR":
                        total=a*0.943;
                        System.out.println(a + " USD = "+total+" EUR");
                        break;
                    case "CAD":
                        total=a*1.351;
                        System.out.println(a + " USD = "+total+" CAD");
                        break;
                    case "JPY":
                        total=a*132.440;
                        System.out.println(a + " USD = "+total+" JPY");
                        break;
                    case "CNY":
                        total=a*6.871;
                        System.out.println(a + " USD = "+total+" CNY");
                        break;
                    default:
                        total=a*1;
                        System.out.println(a + " USD = "+total+" USD");
                        break;
                }
                break;
                
            case "INR":
                System.out.print("Enter the Target Currency: ");
                switch(sc.next())
                {
                    case "USD":
                        total=a*0.0120;
                        System.out.println(a + " INR = "+total+" USD");
                        break;
                    case "EUR":
                        total=a*0.01139;
                        System.out.println(a + " INR = "+total+" EUR");
                        break;
                    case "CAD":
                        total=a*0.0163;
                        System.out.println(a + " INR = "+total+" CAD");
                        break;
                    case "JPY":
                        total=a*1.6012;
                        System.out.println(a + " INR = "+total+" JPY");
                        break;
                    case "CNY":
                        total=a*0.083;
                        System.out.println(a + " INR = "+total+" CNY");
                        break;
                    default:
                        total=a*1;
                        System.out.println(a + " INR = "+total+" INR");
                        break;
                }
                break;
            case "EUR":
                System.out.print("Enter the Target Currency: ");
                switch(sc.next())
                {
                    case "USD":
                        total=a*1.06057;
                        System.out.println(a + " EUR = "+total+" USD");
                        break;
                    case "INR":
                        total=a*87.74738;
                        System.out.println(a + " EUR = "+total+" INR");
                        break;
                    case "CAD":
                        total=a*1.4336;
                        System.out.println(a + " EUR = "+total+" CAD");
                        break;
                    case "JPY":
                        total=a*140.5083;
                        System.out.println(a + " EUR = "+total+" JPY");
                        break;
                    case "CNY":
                        total=a*7.2925;
                        System.out.println(a + " EUR = "+total+" CNY");
                        break;
                    default:
                        total=a*1;
                        System.out.println(a + " EUR = "+total+" EUR");
                        break;
                }
                break;
            case "CAD":
                System.out.print("Enter the Target Currency: ");
                switch(sc.next())
                {
                    case "USD":
                        total=a*0.7397;
                        System.out.println(a + " CAD = "+total+" USD");
                        break;
                    case "INR":
                        total=a*61.2043;
                        System.out.println(a + " CAD = "+total+" INR");
                        break;
                    case "EUR":
                        total=a*0.6975;
                        System.out.println(a + " CAD = "+total+" EUR");
                        break;
                    case "JPY":
                        total=a*98.0054;
                        System.out.println(a + " CAD = "+total+" JPY");
                        break;
                    case "CNY":
                        total=a*5.0865;
                        System.out.println(a + " CAD = "+total+" CNY");
                        break;
                    default:
                        total=a*1;
                        System.out.println(a + " CAD = "+total+" CAD");
                        break;
                }
                break;
            case "JPY":
                System.out.print("Enter the Target Currency: ");
                switch(sc.next())
                {
                    case "USD":
                        total=a*0.00754;
                        System.out.println(a + " JPY = "+total+" USD");
                        break;
                    case "INR":
                        total=a*0.6244;
                        System.out.println(a + " JPY = "+total+" INR");
                        break;
                    case "EUR":
                        total=a*0.00711;
                        System.out.println(a + " JPY = "+total+" EUR");
                        break;
                    case "CAD":
                        total=a*0.01020;
                        System.out.println(a + " JPY = "+total+" CAD");
                        break;
                    case "CNY":
                        total=a*0.051900;
                        System.out.println(a + " JPY = "+total+" CNY");
                        break;
                    default:
                        total=a*1;
                        System.out.println(a + " JPY = "+total+" JPY");
                        break;
                }
                break;
            case "CNY":
                System.out.print("Enter the Target Currency: ");
                switch(sc.next())
                {
                    case "USD":
                        total=a*0.1454;
                        System.out.println(a + " CNY = "+total+" USD");
                        break;
                    case "INR":
                        total=a*12.0325;
                        System.out.println(a + " CNY = "+total+" INR");
                        break;
                    case "EUR":
                        total=a*0.13712;
                        System.out.println(a + " CNY = "+total+" EUR");
                        break;
                    case "CAD":
                        total=a*0.19659;
                        System.out.println(a + " CNY = "+total+" CAD");
                        break;
                    case "JPY":
                        total=a*19.26750;
                        System.out.println(a + " CNY = "+total+" JPY");
                        break;
                    default:
                        total=a*1;
                        System.out.println(a + " CNY = "+total+" CNY");
                        break;
                }
                break;
        }
    }
}
