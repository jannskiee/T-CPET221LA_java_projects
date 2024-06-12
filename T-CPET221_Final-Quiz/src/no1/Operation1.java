package no1; import java.util.Scanner;

public class Operation1 {
	private int num1;
	private int num2;
	
	Operation1(){
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Input two numbers: ");
		num1 = scan1.nextInt();
		num2 = scan1.nextInt();
	}
	
	public void addition() {
		int sum = num1 + num2;
		System.out.println("SUM: " + sum);
	}
	
	
	
}
