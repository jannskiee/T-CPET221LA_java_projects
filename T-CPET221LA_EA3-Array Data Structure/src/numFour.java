// Write a Java program that finds and display the intersection of two arrays of integers, i.e.,
// the common elements between them. Each array have 5 input elements.

import java.util.Scanner;

public class numFour {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        int arr1Length = arr1.length;
        int arr2Length = arr2.length;

        System.out.println("Enter five numbers for the first array: ");

        for (int i = 0; i < arr1Length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter five numbers for the second array: ");

        for (int i = 0; i < arr2Length; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("The common elements between the two arrays are: ");

        for (int i = 0; i < arr1Length; i++) {
            for (int j = 0; j < arr2Length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
