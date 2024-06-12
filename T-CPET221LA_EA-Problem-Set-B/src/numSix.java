// Create a program that will implement method overloading (three methods with different number of parameters)

import java.util.Scanner;

public class numSix {
    public void display(){
        System.out.println("\nNo parameters");
    }

    public void display(int num1){
        System.out.println("One parameter: " + num1);
    }

    public void display(int num1, int num2){
        System.out.println("Two parameters: " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numSix obj = new numSix();

        int[] num = new int[2];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter a number: ");
            num[i] = sc.nextInt();
        }

        obj.display();
        obj.display(num[0]);
        obj.display(num[0], num[1]);

    }

}
