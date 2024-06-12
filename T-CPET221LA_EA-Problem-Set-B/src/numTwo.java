// Create a money converter. Your program will ask for an input of amount (in PHP) and display its equivalent currency of choice. Use the following functions as reference. (Use the internet to refer for money conversions).
//
//        int money() – returns the input amount to be converted (in PHP)
//
//        string currency() returns the currency string of choice to be used in conversion. Use the following conversion for choices.
//
//        'SGD' – Singapore dollar.
//
//        'USD' – US dollar
//
//        'YEN' – Japan yen
//
//        'EUR' – Euros

import java.util.Scanner;

public class numTwo {
    public static int money() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in PHP: ");
        return sc.nextInt();
    }

    public static String currency() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter currency to convert to (SGD, USD, YEN, EUR): ");
        return sc.nextLine().toUpperCase();
    }

    public static void main(String[] args) {

        int money = money();
        String currency = currency();

        if (currency.equals("SGD")) {
            System.out.println("\nPHP " + money + " is equivalent to SGD " + (money * 0.024));
        } else if (currency.equals("USD")) {
            System.out.println("\nPHP " + money + " is equivalent to USD " + (money * 0.018));
        } else if (currency.equals("YEN")) {
            System.out.println("\nPHP " + money + " is equivalent to YEN " + (money * 2.63));
        } else if (currency.equals("EUR")) {
            System.out.println("\nPHP " + money + " is equivalent to EUR " + (money * 0.017));
        } else {
            System.out.println("\nInvalid currency.");
        }
    }
}
