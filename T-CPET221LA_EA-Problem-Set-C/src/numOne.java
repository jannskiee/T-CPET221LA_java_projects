// Your program will ask to display your details. Create a class with the following methods inside. Draw UML
//        name() – display your name.
//        course() – display your course.
//        stdnum() – display your student number.

import java.util.Scanner;

public class numOne {
    public static void name() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is " + name);
        course();
    }

    public static void course(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your course: ");
        String course = sc.nextLine();
        System.out.println("Your course is " + course);
        stdnum();
    }

    public static void stdnum(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your student number: ");
        String stdnum = sc.nextLine();
        System.out.println("Your student number is " + stdnum);
    }

    public static void main(String[] args) {
        name();
    }
}

//        UML DIAGRAM:
//        -----------------------
//        |      numOne         |
//        -----------------------
//        | + name()            |
//        | + course()          |
//        | + stdnum()          |
//        -----------------------

