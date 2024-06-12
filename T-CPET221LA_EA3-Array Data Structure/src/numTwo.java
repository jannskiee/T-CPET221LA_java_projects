// Write a Java program that finds the maximum and minimum values in an 10 input array of integers.

import java.util.Scanner;

public class numTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        int max = 0;
        int arrLength = arr.length;

        System.out.println("Enter ten numbers to be compared: ");
        int min = sc.nextInt();

        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("\nThe minimum value in the array is " + min);
        System.out.println("The maximum value in the array is " + max);

    }
}
