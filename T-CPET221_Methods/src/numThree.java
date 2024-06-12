// Input your motto in life and your favorite positive number; and display your motto based on your input number.
// Use the following methods in your program.
//        •	inputMotto() – returns the input motto in life;
//        •	displayMotto(X,motto) – displays your motto in life repeatedly based on the number X.

import java.util.Scanner;

public class numThree {
    public static void inputMotto() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your motto in life: ");
    String motto = sc.nextLine();

    while (true) {
        System.out.println("\nEnter your favorite positive number: ");
        int num = sc.nextInt();
        if (num > 0) {
            displayMotto(num, motto);
            break;
        } else {
            System.out.println("Invalid input. Please enter a positive number.");
        }
    }
}

    public static void displayMotto(int X, String motto) {
        System.out.println();
        System.out.println("Motto in life:");
        for (int i = 0; i < X; i++) {
            System.out.println(motto);
        }

    }

    public static void main(String[] args) {
        inputMotto();
    }
}
