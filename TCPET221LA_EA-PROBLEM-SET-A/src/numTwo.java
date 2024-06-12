// Write a Java program that prompts the user to enter a password. If the password matches a predefined password, the program should display a "Login Successful" message.
// If the password is incorrect, allow the user to try again up to 3 times. After 3 unsuccessful attempts, display a "Login Failed" message.

import java.util.Scanner;

public class numTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "202080360";

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter password: ");
            String input = sc.nextLine();

            if (input.equals(password)) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Login Failed");
            }
        }
    }
}
