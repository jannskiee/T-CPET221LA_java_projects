// Modifying problem #1, use a constructor as a setter.

import java.util.Scanner;

public class numTwo {
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
    }
}
