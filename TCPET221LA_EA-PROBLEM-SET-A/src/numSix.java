// Build a Java program that generates the Fibonacci sequence up to a specified number of terms entered by the user.
// The Fibonacci sequence starts with 0 and 1, and each subsequent term is the sum of the previous two terms

import java.util.Scanner;

public class numSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int first = 0;
        int second = 1;
        int next;

        System.out.print(first + " " + second);

        for (int i = 2; i < num; i++) {
            next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
}
