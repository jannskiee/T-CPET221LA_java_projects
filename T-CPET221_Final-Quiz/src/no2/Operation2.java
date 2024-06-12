package no2; import java.util.Scanner;

public class Operation2 {
	private int num1;
	private int num2;
	
	Operation2(){
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Input two numbers: ");
		num1 = scan1.nextInt();
		num2 = scan1.nextInt();
	}
	
	public int addition() {
		return num1 + num2;
	}

}
