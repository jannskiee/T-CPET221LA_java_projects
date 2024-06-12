// Use the UML class diagram as a reference below. setNumber(int,int) will initialize the values of a and b. add()
// will display the sum of a and b, while large() will display the value of large which is the largest among the two.

// exp1:Operation
// a = 100
// b = 50

// exp2:Operation
//a = 500
//b = 100

// Operation
// -a : int
// -b : int
// -large : int
// -sum : int
// +setNumber(int,int) : void
// +add() : void
// +large() : void

public class Main {
    public static void main(String[] args) {
        System.out.println("Operation 1 (a= 100, b = 50)");
        Operation exp1 = new Operation();
        exp1.setNumber(100, 50);
        exp1.add();
        exp1.large();

        System.out.println("\nOperation 2 (a= 500, b = 100)");
        Operation exp2 = new Operation();
        exp2.setNumber(500, 100);
        exp2.add();
        exp2.large();
    }
}