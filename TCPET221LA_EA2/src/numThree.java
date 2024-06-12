// Input three numbers and display the largest among the three.

import java.util.Scanner;

public class numThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = 0;
        int second = 0;
        int third = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter three number: ");
            int number = sc.nextInt();

            if (i == 0) {
                first = number;
            } else if (i == 1) {
                second = number;
            } else {
                third = number;
            }
        }

        if (first > second && first > third) {
            System.out.println("\n" + first + " is the largest number.");
        } else if (second > first && second > third) {
            System.out.println("\n" + second + " is the largest number.");
        } else if (third > first && third > second) {
            System.out.println("\n" + third + " is the largest number.");
        } else {
            System.out.println("\nThere is no largest number.");
        }
    }
}
