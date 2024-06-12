// If the input voltage in the switch is 5V, it means it is ACTIVE. If the input voltage is less than 5V, it means it is CUTOFF.
// If the input voltage is greater than 5V, it means it is BREAKDOWN. Assuming there are two switches SWA, SWB;
// The program will ask for an input voltage for the two switches, and display “LED ON” if at least one of the switches are ACTIVE, otherwise, display “LED OFF”.

import java.util.Scanner;

public class numThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A, B;

        System.out.println("Enter two voltages: ");
        A = input.nextDouble();
        B = input.nextDouble();

        if (A==5.0 || B==5.0) {
            System.out.println("LED ON");
        } else {
            System.out.println("LED OFF");
        }
    }
}
