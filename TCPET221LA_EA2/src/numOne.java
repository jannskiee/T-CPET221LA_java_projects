// Input your complete student details and then display it. (Student name, Course and Student #)

import java.util.Scanner;

public class numOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "";
        String course = "";
        String studentNumber = "";

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("Enter name: ");
                name = sc.nextLine();
            } else if (i == 1) {
                System.out.println("Enter course: ");
                course = sc.nextLine();
            } else {
                System.out.println("Enter student number: ");
                studentNumber = sc.nextLine();
            }
        }

        System.out.println("\nName: " + name);
        System.out.println("Course: " + course);
        System.out.println("Student Number: " + studentNumber);
    }
}