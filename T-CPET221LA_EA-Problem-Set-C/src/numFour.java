// A method will return the integer input. Another method will accept the integer input as a parameter and return if it is negative or positive number.
// Display the result in main method. Provide the UML diagram of your program.

import java.util.Scanner;

public class numFour {
    public static int returnNum(int num) {
        return num;
    }

    public static String checkNum(int num) {
        if (num < 0) {
            return "Negative";
        } else {
            return "Positive";
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("\nThe number is " + returnNum(num));

        System.out.println("Also, the number is " + checkNum(num));
    }
}

//         UML DIAGRAM:
//         --------------------------
//         |      numFour           |
//         -------------------------|
//         | + returnNum(int): int  |
//         | + checkNum(int): String|
//         -------------------------|
//         | + main(String[]): void |
//         -------------------------|
