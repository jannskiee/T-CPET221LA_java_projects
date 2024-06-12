// Develop a Java program that prompts the user for their age. Based on the input,
// categorize them as "Child" (0-12), "Teen" (13-19), "Adult" (20-59), or "Senior" (60+)

import java.util.Scanner;

public class numThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 0 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Adult");
        } else if (age >= 60) {
            System.out.println("Senior");
        } else {
            System.out.println("Invalid input");
        }
    }
}
