// Execute a program that will ask for a name as an input, and display as follows: “Hello Joshua! Have a nice day”.
// Use the following methods in your program.
//        •	inputName() – returns the input name;
//        •	displayGreet(name) – accepts the name as a parameter, and display the whole greeting

import java.util.Scanner;

public class numOne {
    public static void inputName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        displayGreet(name);
        return;
    }

    public static void displayGreet(String name) {
        System.out.println("Hello " + name + "! Have a nice day");
        return;
    }

    public static void main(String[] args) {
        inputName();
    }
}