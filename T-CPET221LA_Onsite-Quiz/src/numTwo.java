// Input a integer and display the number (either descending or ascending) until it each 0

import java.util.Scanner;
public class numTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        while(num!=0){
            if (num > 0){
                num -= 1;
                System.out.println(num);
            } else {
                num += 1;
                System.out.println(num);
            }
        }
    }
}
