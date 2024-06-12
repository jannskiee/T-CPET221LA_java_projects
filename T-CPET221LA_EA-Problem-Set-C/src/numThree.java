//  Input two numbers and display their sum, difference, product, quotient and remainder. Use the methods inside a class. Draw the UML of your program
//
//        int sum(int,int) – accepts the two input numbers as parameters and return their sum
//
//        int diff(int,int) – accepts the two input numbers as parameters and return their difference
//
//        int prod(int,int) – accepts the two input numbers as parameters and return their product
//
//        float quo(int,int) – accepts the two input numbers as parameters and return their quotient
//
//        boolean rem(int,int) – accepts the two input numbers as parameters and return boolean value if the numbers are equal are not.

import java.util.Scanner;

public class numThree {
    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static int diff(int num1, int num2){
        return num1 - num2;
    }

    public static int prod(int num1, int num2){
        return num1 * num2;
    }

    public static float quo(int num1, int num2){
        return (float) num1 / num2;
    }

    public static boolean rem(int num1, int num2){
        return num1 == num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Sum: " + sum(num1, num2));
        System.out.println("Difference: " + diff(num1, num2));
        System.out.println("Product: " + prod(num1, num2));
        System.out.println("Quotient: " + quo(num1, num2));
        System.out.println("Remainder: " + rem(num1, num2));


    }
}

//        UML DIAGRAM:
//        -------------------------------
//        |          numThree            |
//        -------------------------------
//        | + sum(int, int): int         |
//        | + diff(int, int): int        |
//        | + prod(int, int): int        |
//        | + quo(int, int): float       |
//        | + rem(int, int): boolean     |
//        |------------------------------|
//        | + main(String[]): void      |
//        -------------------------------