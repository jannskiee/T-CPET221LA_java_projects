// Write a program that accepts three numbers from the user and prints "increasing" if the number are in increasing order,
// "decreasing" if the number are in decreasing order, and "Neither increase or decreasing order" otherwise

import java.util.Scanner;

public class numThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a three numbers simultaneously: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 < num2 && num2 < num3){
            System.out.println("Increasing");
        } else if (num1 > num2 && num2 > num3){
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increase or Decreasing order");
        }
    }
}
