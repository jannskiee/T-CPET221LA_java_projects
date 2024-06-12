// Input the name and age of the student and display its values. A class Student has two encapsulated variables,
// stdName that contains the student’s name, and stdAge that contains the age of the student.
// Draw the UML diagram and perform its Java code. Use studentA as an object of the class.

import java.util.Scanner;

public class numOne {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("The student's name: ");
    String name = sc.nextLine();
    System.out.print("The student's age: ");
    int age = sc.nextInt();
    sc.close();

    System.out.println();

    StudentOne studentA = new StudentOne(name, age);

    System.out.println("Name: " + studentA.getstdName());
    System.out.println("Age: " + studentA.getstdAge());
    }
}

// UML DIAGRAM:
//        +------------------+
//        |     Student      |
//        +------------------+
//        | - stdName: String|
//        | - stdAge: int     |
//        +------------------+
//        | + Student(stdName: String, stdAge: int)
//        | + getStdName(): String
//        | + getStdAge(): int
//        +------------------+
