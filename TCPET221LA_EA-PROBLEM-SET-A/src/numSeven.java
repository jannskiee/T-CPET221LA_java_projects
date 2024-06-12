// Build a Java program that generates a multiplication table for a number entered by the user.
// The table should display the multiplication of the entered number from 1 to 10

import java.util.Scanner;

public class numSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
