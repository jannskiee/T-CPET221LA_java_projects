// Write a Java program that takes an array of integers as input and calculates the sum of all the elements in the array.

import java.util.Scanner;

public class numOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers to be added: ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        int sum = 0;
        int arrLength = arr.length;

        System.out.println("Enter numbers to be added: ");

        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("The Total sum of all elements in the array is " + sum);
    }
}