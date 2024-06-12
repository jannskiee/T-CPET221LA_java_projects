// Create a Java program that searches for a specific element in an array of float numbers and display it’s index if found.
// If the element is not in the array, display “not existing”.

import java.util.Scanner;

public class numThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers to be added: ");
        int num = sc.nextInt();

        float[] arr = new float[num];

        int arrLength = arr.length;

        System.out.println("Enter numbers to be added: ");

        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextFloat();
        }

        System.out.println("Enter a number to be searched: ");
        float search = sc.nextFloat();

        for (int i = 0; i < arrLength; i++) {
            if (arr[i] == search) {
                System.out.println("The index of the searched number is " + i);
                break;
            } else if (i == arrLength - 1) {
                System.out.println("The number does not exist in the array.");
            }
        }
    }
}
