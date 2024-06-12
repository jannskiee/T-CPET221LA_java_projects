public class Derived extends Base{
    public void displaySumAndProduct() {
        // Accessing the private variables using getter methods
        int sum = getVariable1() + getVariable2();
        int product = getVariable1() * getVariable2();

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
