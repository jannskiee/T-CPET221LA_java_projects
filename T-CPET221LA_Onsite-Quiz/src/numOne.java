// Build a Java Program that generates a multiplcation table for a number ented by the user.
// THe table should display the multiplcation of the eneted number from 1- 10

import java.util.Scanner;

public class numOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for multiplcation table: ");
        int userInput = sc.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(i + " x " + userInput + " = " + (i * userInput));
        }
    }
}