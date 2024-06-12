// The program will display the largest number between 2 to 4 numbers. Use the UML diagram below as a guide. The following methods are as follows.
//        getLarge() – accepts 2 to 4 numbers as parameters and returns the value of X which is the largest between the parameters.

import java.util.Scanner;

public class numFive {
    private int X;

    public static int getLarge(int num1, int num2){
        return Math.max(num1, num2);
    }

    public static int getLarge(int num1, int num2, int num3){
        return Math.max(num1, Math.max(num2, num3));
    }

    public static int getLarge(int num1, int num2, int num3, int num4){
        return Math.max(num1, Math.max(num2, Math.max(num3, num4)));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to input? (2-4): ");
        int totalNum = sc.nextInt();

        int[] num = new int[totalNum];
        for (int i = 0; i < totalNum; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        int numLength = num.length;

        if (numLength == 2){
            System.out.println("The largest number is " + getLarge(num[0], num[1]));
        } else if (numLength == 3){
            System.out.println("The largest number is " + getLarge(num[0], num[1], num[2]));
        } else if (numLength == 4){
            System.out.println("The largest number is " + getLarge(num[0], num[1], num[2], num[3]));
        } else {
            System.out.println("Invalid input");
        }
    }
}
