import java.util.Scanner;

public class Square extends Quadrilaterals {
	Scanner scan1 = new Scanner(System.in);
	Quadrilaterals obj = new Quadrilaterals();
	
	public void compute() {
		System.out.println("Enter square sides: ");
		int a = scan1.nextInt();
		int b = scan1.nextInt();
		obj.setValue(a, b);
		int per = 2*(a+b);
		System.out.println("SQUARE Perimeter: " + per);
	}

}
