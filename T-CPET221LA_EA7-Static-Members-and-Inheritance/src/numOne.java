// Create a class name Sales that will compute the annual sales of the company. Use the following below in your program
//      •	A constructor will ask for input value for the sales of the first half and second half of the year.
//      •	A void method will compute for the total sales.
//      •	A method will return the total sales. Display the total sales in the main program.
//      •	The company has two groups. A static method will display the total sales of two groups.

import java.util.Scanner;

public class numOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sales for the first half of the year: ");
        int companyAfirst = sc.nextInt();
        System.out.println("Enter the sales for the second half of the year: ");
        int companyAsecond = sc.nextInt();

        SalesOne obj = new SalesOne(companyAfirst, companyAsecond);
        obj.compute();
        System.out.println("The total sale is: " + obj.totalSales());

        System.out.println();

        System.out.println("Enter the sales for the first half of the year: ");
        int companyBfirst = sc.nextInt();
        System.out.println("Enter the sales for the second half of the year: ");
        int companyBsecond = sc.nextInt();

        SalesOne obj2 = new SalesOne(companyBfirst, companyBsecond);
        obj2.compute();
        System.out.println("The total sale is: " + obj2.totalSales());

        obj.overallSales(obj2);

    }
}