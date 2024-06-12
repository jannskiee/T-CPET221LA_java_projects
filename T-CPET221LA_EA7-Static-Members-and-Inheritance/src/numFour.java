// The company will hold its quarterly performance for each department; wherein each group of the department are rated from 1 to 5, where 1 is the lowest score and 5 is the highest score.
// There are two departments: groupA and groupB. Each group will be rated by five evaluators.
// Create a program that will ask for the input rate of the evaluators, and determine the group that got the highest rating, as well as the overall rating of the department.
// Use the UML diagram below as a reference.
//      •	Department() – accepts 5 ratings of the evaluators and determines the groupScore which is  the total rating of the group.
//      •	getGroupAverage() – returns the value of groupAverage which is the average score of the group.
//      •	displayAverage() – displays the overAllAverage which is the average of the whole department.
//      •	overAllScore is the over all score of the department.

import java.util.Scanner;

public class numFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Group A, Enter the five rating of the evaluators, simultaneously: ");
        int eval1 = sc.nextInt();
        int eval2 = sc.nextInt();
        int eval3 = sc.nextInt();
        int eval4 = sc.nextInt();
        int eval5 = sc.nextInt();

        System.out.println("Group B, Enter the five rating of the evaluators, simultaneously: ");
        int eval6 = sc.nextInt();
        int eval7 = sc.nextInt();
        int eval8 = sc.nextInt();
        int eval9 = sc.nextInt();
        int eval10 = sc.nextInt();


        Evaluate groupA = new Evaluate(eval1, eval2, eval3, eval4, eval5);
        Evaluate groupB = new Evaluate(eval6, eval7, eval8, eval9, eval10);

        groupA.Department();
        groupB.Department();

        System.out.println("\nThe average score of group A is: " + groupA.getGroupAverage());
        System.out.println("The average score of group B is: " + groupB.getGroupAverage());

        groupA.displayAverage(groupB);

        groupA.overAllScore(groupB);

        if (groupA.groupScore > groupB.groupScore) {
            System.out.println("\nGroup A has the highest rating.");
        } else if (groupA.groupScore < groupB.groupScore) {
            System.out.println("\nGroup B has the highest rating.");
        } else {
            System.out.println("\nGroup A and B has the same rating.");
        }
    }
}
