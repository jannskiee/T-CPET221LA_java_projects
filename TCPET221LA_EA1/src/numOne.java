// Create a simple calculator program for a cashier in a grocery. Your program will require to input the price of three items, the payment of the customer; and also the customer’s age. Use the following below as a reference for your computation.
//        a.	All items are subject to 10% tax rate.
//        b.	If the customer is a senior citizen, the have an discount of 20%
//        c.	At the end of the program, display the change of the customer. Display also if the payment of the customer is insufficient.

import java.util.Scanner;

public class numOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A, B, C, result, age, discount, tax, total, payment, change;

        System.out.println("Enter the price of first item: ");
        A = input.nextDouble();
        System.out.println("Enter the price of second item: ");
        B = input.nextDouble();
        System.out.println("Enter the price of third item: ");
        C = input.nextDouble();

        result = A + B + C;
        System.out.println("Total: " + result);

        System.out.println("Enter your age");
        age = input.nextInt();

        if (age >= 60) {
            tax = result * 0.10;
            total = result + tax;
            discount = total - (total * 0.20);
            System.out.println("Total: " + discount);

            System.out.println("Enter your payment");
            payment = input.nextDouble();
            change = payment - discount;
            System.out.println("Change: " + change);
        } else {
            tax = result * 0.10;
            total = result + tax;
            System.out.println("Total: " + total);

            System.out.println("Enter your payment");
            payment = input.nextDouble();
            change = payment - total;
            System.out.println("Change: " + change);
        }
    }
}