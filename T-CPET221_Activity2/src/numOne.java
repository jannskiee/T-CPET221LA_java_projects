// Input three numbers. Display “Unique Numbers” if no two number has the same value.
// Otherwise, display “Not Unique Numbers”

import java.util.Scanner;

public class numOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        num3 = scanner.nextInt();

        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Not Unique Numbers");
        } else {
            System.out.println("Unique Numbers");
        }
    }
}
