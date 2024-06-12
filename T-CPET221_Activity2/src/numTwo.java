// Input the age of a person, and display if they are “Minor”, “Legal” or “Senior Citizen”.
// 17 years old and below are considered minors. While 60 and above are considered senior citizen

import java.util.Scanner;

public class numTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (age <= 17) {
            System.out.println("Minor");
        } else if (age >= 60) {
            System.out.println("Senior Citizen");
        } else {
            System.out.println("Legal");
        }
    }
}
