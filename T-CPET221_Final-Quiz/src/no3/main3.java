// Class Sales is used to compute for the discounted price of the purchased product.
// By using the UML below, your program will ask for the price of the product and the discount rate,
// and display the discounted price.

package no3; import java.util.Scanner;

public class main3 {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Enter price of the product: ");
		double price = scan1.nextDouble();
		System.out.println("Enter discount rate (in percentage): ");
		double discountRate = scan1.nextDouble();;
		
		Sales objA = new Sales();
		objA.setSale(price, discountRate);
		
		System.out.println("PRICE: PHP " + objA.getPrice());
		System.out.println("Discount: " + objA.getDiscountRate()*objA.getPrice());
		double total = (objA.getPrice() - (objA.getPrice()*objA.getDiscountRate()));
		System.out.println("TOTAL: PHP " + total);
	}

}
