// Input a number and display its multiplication table up to 10. Use the following functions below as reference:
//        INPUT() – ask for an input number and returns the number
//        PRODUCT(table,num) – accepts table (the multiplier in the multiplication table) and num (your input number) as the parameter, and display the product.

import java.util.Scanner;

public class numThree {
    public static int INPUT() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to be multiplied: ");
        return sc.nextInt();
    }

    public static void PRODUCT(int table, int num) {
        if (table <= 10) {
            System.out.println(num + " x " + table + " = " + (num * table));
            PRODUCT(table + 1, num);
        }
    }

    public static void main(String[] args) {
        int num = INPUT();
        PRODUCT(1, num);
    }
}
