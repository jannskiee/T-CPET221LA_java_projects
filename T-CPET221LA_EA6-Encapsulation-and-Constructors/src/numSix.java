// Modifying problem #1, use a constructor as a setter. Draw the UML Diagram

import java.util.Scanner;

public class numSix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("The student's name: ");
        String name = sc.nextLine();
        System.out.print("The student's age: ");
        int age = sc.nextInt();

        System.out.println();

        StudentTwo studentA = new StudentTwo(name, age);

        System.out.println("Name: " + studentA.getstdName());
        System.out.println("Age: " + studentA.getstdAge());

        System.out.println("\n\nUML Diagram: ");
        System.out.println("+-------------------+\n" +
                "|    StudentTwo     |\n" +
                "+-------------------+\n" +
                "|                   |\n" +
                "+-------------------+\n" +
                "|                   |\n" +
                "| - stdName: String |\n" +
                "| - stdAge: int     |\n" +
                "|                   |\n" +
                "+-------------------+\n" +
                "|                   |\n" +
                "| + StudentTwo(stdName: String, stdAge: int) |\n" +
                "| + getstdName(): String |\n" +
                "| + getstdAge(): int |\n" +
                "|                   |\n" +
                "+-------------------+\n");
        System.out.println("+-------------------+\n" +
                "|      numSix       |\n" +
                "+-------------------+\n" +
                "|                   |\n" +
                "+-------------------+\n" +
                "|                   |\n" +
                "|                   |\n" +
                "|                   |\n" +
                "|                   |\n" +
                "|                   |\n" +
                "| + main(args: String[]) : void |\n" +
                "|                   |\n" +
                "+-------------------+\n");
    }
}
