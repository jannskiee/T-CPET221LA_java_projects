// Search in the internet the exchange rate of PHP vs USD and SGD. In your program,
// input a PHP peso and display its equivalent USD and SGD values. Display also the source of your conversion rate.

import java.util.Scanner;

public class numTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter PHP amount: ");
        double php = sc.nextDouble();

        double usd = php * 0.018;
        double sgd = php * 0.024;

        System.out.println("\nPHP to USD: " + usd + "$");
        System.out.println("PHP to SGD: " + sgd + "S$");
        System.out.println("\nUSD Source: https://g.co/kgs/jG96pV");
        System.out.println("SGD Source: https://g.co/kgs/sQPCKy");
    }
}
