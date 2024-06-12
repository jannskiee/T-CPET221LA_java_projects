// Your program will identify if the shape is a square or a rectangle.
// Input the length and width of the shape, and display if it’s a rectangle or square, with its area and perimeter.
// Use the following methods in your program.
//        •	inputLength() – returns the input length;
//        •	inputWidth() – returns the input width;
//        •	analyze(length,width) – based on the parameters length and width, returns a Boolean value if the shape is square or not
//        •	compute(length,width) – based on the parameters length and width, display the area and the perimeter of the shape.

import java.util.Scanner;

public class numTwo {
    public static int inputLength() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the shape: ");
        int length = sc.nextInt();

        return length;
    }


    public static void inputWidth() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the width of the shape: ");
        int width = sc.nextInt();

        analyze(inputLength(), width);

    }

    public static void analyze(int length, int width) {
        if (length == width) {
            System.out.println("\nThe shape is a square");
        } else {
            System.out.println("\nThe shape is a rectangle");
        }
        compute(length, width);

    }

    public static void compute(int length, int width) {
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("The area of the shape is " + area + " and the perimeter is " + perimeter);
    }

    public static void main(String[] args) {
        inputWidth();
    }
}
