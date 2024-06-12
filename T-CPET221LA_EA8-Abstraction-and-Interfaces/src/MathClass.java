// Create three interfaces for the following.
//      •	Method that accepts the number and return if its positive or negative.
//      •	Methods that accept 2 parameters and return their difference, product and quotient.
//      •	Methods that accept 2 to 4 parameters and return their sum. (Use overloaded)

public class MathClass implements TemplateA, TemplateB, TemplateC{


    @Override
    public boolean isPositive(int num) {
        return (num>=0);
    }

    @Override
    public int difference(int num1, int num2) {
        return (num1-num2);
    }

    @Override
    public int product(int num1, int num2) {
        return (num1*num2);
    }

    @Override
    public double quotient(int num1, int num2) {
        return ((double) num1 /num2);
    }

    @Override
    public int sum(int num1, int num2) {
        return (num1+num2);
    }

    @Override
    public int sum(int num1, int num2, int num3) {
        return (num1+num2+num3);
    }

    @Override
    public int sum(int num1, int num2, int num3, int num4) {
        return (num1+num2+num3+num4);
    }
}

