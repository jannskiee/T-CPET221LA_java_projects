// Display like the figure where the value of the number is an input value. (In this example, the value of input number is 4.)
// 0000
// XXXX
// 0000
// XXXX

import java.util.Scanner;

public class numFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = sc.nextInt();

        System.out.println();

        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < number; j++)
                    System.out.print("0");
                System.out.println();
            } else {
                for (int j = 0; j < number; j++)
                    System.out.print("X");
                System.out.println();
            }
        }

    }
}
