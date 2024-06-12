import java.util.Scanner;

public class Rectangle extends Quadrilaterals {
	Scanner scan1 = new Scanner(System.in);
	Quadrilaterals obj = new Quadrilaterals();
	
	public void compute() {
		System.out.println("Enter RECTANGLE length and width, respectively: ");
		int a = scan1.nextInt();
		int b = scan1.nextInt();
		obj.setValue(a, b);
		int per = 4*(a);
		System.out.println("RECTANGLE Perimeter: " + per);
	}
}
