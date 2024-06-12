public class numTwo {
    public static void main(String[] args){
        MathClass math = new MathClass();
        System.out.println(math.isPositive(5));
        System.out.println(math.difference(5, 3));
        System.out.println(math.product(5, 3));
        System.out.println(math.quotient(5, 3));
        System.out.println(math.sum(5, 3));
        System.out.println(math.sum(5, 3, 2));
        System.out.println(math.sum(5, 3, 2, 1));
    }
}
