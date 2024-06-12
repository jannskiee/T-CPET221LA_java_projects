// Input the speed of Superman in (m/s).
// Compute and display (in min) how long it would take him to travel 50km.

import java.util.Scanner;

public class numTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the speed of Superman in (m/s): ");
        double speed = input.nextDouble();
        double distance = 50000;
        double time = distance / speed;

        System.out.println("Superman will travel " + time/60 + " min in 50km.");
    }
}
