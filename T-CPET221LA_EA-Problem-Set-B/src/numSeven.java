// Create a program that will implement method overloading (three methods with different data types of parameters)

import java.util.Scanner;

public class numSeven {
    public void display(int num) {
        System.out.println("\nMethod with int parameter: " + num);
    }

    public void display(String text) {
        System.out.println("Method with String parameter: " + text);
    }

    public void display(boolean bool) {
        System.out.println("Method with boolean parameter: " + bool);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numSeven obj = new numSeven();

        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();

        System.out.print("Enter a string: ");
        String stringValue = sc.next();

        System.out.print("Enter a boolean: ");
        boolean booleanValue = sc.nextBoolean();

        obj.display(intValue);
        obj.display(stringValue);
        obj.display(booleanValue);
    }
}
