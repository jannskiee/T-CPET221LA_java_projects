// Create a Java program that would input any numbers and display the odd and even numbers.
//        Sample Output:
//        Enter any Number: 10
//        The Odd number is: 1
//        The Odd number is: 3
//        The Odd number is: 5
//        The Odd number is: 7
//        The Odd number is: 9
//        The Average is: ______
//        The Even number is: 2
//        The Even number is: 4
//        The Even number is: 6
//        The Even number is: 8
//        The Even number is: 10
//        The Average is: ______
//        Try Again [Yy/Nn]:

import java.util.Scanner;

public class numOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = "Y";

        while (user.equalsIgnoreCase("Y")) {
            System.out.println("Enter any Number: ");
            int num = sc.nextInt();

            int odd = 0;
            int odd_loop = 0;

            int even = 0;
            int even_loop = 0;

            for (int i = 1; i <= num; i += 2) {
                odd += i;
                odd_loop++;
                System.out.println("The Odd number is: " + i);
            }
            System.out.println("The Average is: " + (double) odd / odd_loop);

            System.out.println();

            for (int i = 2; i <= num; i += 2) {
                even += i;
                even_loop++;
                System.out.println("The Even number is: " + i);
            }
            System.out.println("The Average is: " + (double) even / even_loop);

            System.out.println("Try Again [Yy/Nn]: ");
            sc.nextLine();
            String userInput = sc.nextLine();

            if (userInput.equalsIgnoreCase("N")) {
                user = "N";
            } else if (!userInput.equalsIgnoreCase("Y")) {
                System.out.println("Invalid Input, The program will now exit.");
                user = "N";
            }
        }
        System.out.println("\nThe program will now exit!");
    }
}
