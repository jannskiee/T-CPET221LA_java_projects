// Write a Java program that calculates the sum of all even numbers between 1 and a number entered by the user (inclusive). Display the result

import java.util.Scanner;

public class numFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        if (num % 2 == 0) {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println("\nSum of all even numbers between 1 and " + num + " is " + sum);
        } else {
            System.out.println("Invalid Input! it's an odd number");
        }
    }
}
