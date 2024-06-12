// Your program will continue to ask for two input pincodes until both of the input pincodes are correct. The correct pincodes are 1234 and 5678. Use the method below in your program.
//        bool checkA(int) – accepts the first input pin as a parameter return Boolean value if the first pin is correct (equal to 1234).
//        bool checkB(int) – accepts the first input pin as a parameter return Boolean value if the first pin is correct (equal to 5678).

import java.util.Scanner;

public class numFive {
    public static boolean checkA(int pin) {
        return pin == 1234;
    }

    public static boolean checkB(int pin) {
        return pin == 5678;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first pincode: ");
        int pin1 = sc.nextInt();

        System.out.print("Enter second pincode: ");
        int pin2 = sc.nextInt();

        while (!checkA(pin1) || !checkB(pin2)) {
            System.out.println("\nInvalid Pincode!");

            System.out.print("\nEnter first pincode: ");
            pin1 = sc.nextInt();

            System.out.print("Enter second pincode: ");
            pin2 = sc.nextInt();
        }

        System.out.println("\nCorrect Pincode!");
    }
}
