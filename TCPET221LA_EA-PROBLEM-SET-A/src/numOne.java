// Andrew, Andrei and Andres are engineering classmates looking for a dormitory to stay for the coming school year.
// They will share the monthly payment for the dormitory according to their agreement. This is their agreement. Andrew will pay 40%, Andrei will pay 35% while Andres will pay the remaining balance.
// Create a program that will ask for the monthly rate of the dormitory, and will display the following:
//      a.	How much is the total monthly contribution of Andrew, Andrei and Andres.
//      b.	How much is the total rent in the dormitory for the whole school year, assuming it will last for 10 months
//      c.	How much will Andrew, Andrei and Andres prepare for the whole school year

import java.util.Scanner;

public class numOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly rate: ");
        double monthlyRate = sc.nextDouble();

        double andrew = monthlyRate * 0.4;
        double andrei = monthlyRate * 0.35;
        double andres = monthlyRate - (andrew + andrei);

        double totalMonthly = andrew + andrei + andres;
        double totalSchoolYear = totalMonthly * 10;
        double totalYearly = totalSchoolYear * 3;


        System.out.println("\nA.");
        System.out.println("Andrew: " + andrew);
        System.out.println("Andrei: " + andrei);
        System.out.println("Andres: " + andres);

        System.out.println("\nB.");
        System.out.println("Total rent for the whole school year: " + totalYearly);

        System.out.println("\nC.");
        System.out.println("Total rent for each individual to prepare for the whole school year: " + totalSchoolYear);

    }
}