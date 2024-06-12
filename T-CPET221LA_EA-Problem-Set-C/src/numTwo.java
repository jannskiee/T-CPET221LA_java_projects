// Execute a program that will require an input in prelim, midterm and final grade of the student, and display if it is “PASSED” or “FAILED”. Use the UML diagram below as a guide. The following methods and conditions are are as follows.
//
//        The four private variables indiciated in the UML diagram are for the prelim, midterm, final and average grade resprectively.
//
//        displayFinal(int,int,int) – has three integer parameters which will be the values for the pre, mid and fin variables; and display if the student is “PASSED” or “FAILED”
//
//        computeGrade() – returns the value of average which is the average of pre, mid and fin.
//
//        testGrade() – returns TRUE if the student qualifies the passing rate of 75 and above.

import java.util.Scanner;

public class numTwo {
    private static int prelim;
    private static int midterm;
    private static int finalGrade;
    private static int average;

    public static void displayFinal(int num1, int num2, int num3){
        prelim = num1;
        midterm = num2;
        finalGrade = num3;
        System.out.println("\nGrade's Average: " + computeGrade());
        if (testGrade()){
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

    }

    private static boolean testGrade() {
        return average >= 75;

    }

    private static int computeGrade() {
        average = (prelim + midterm + finalGrade) / 3;
        return average;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your prelim grade: ");
        prelim = sc.nextInt();
        System.out.print("Enter your midterm grade: ");
        midterm = sc.nextInt();
        System.out.print("Enter your final grade: ");
        finalGrade = sc.nextInt();

        displayFinal(prelim, midterm, finalGrade);
    }
}
