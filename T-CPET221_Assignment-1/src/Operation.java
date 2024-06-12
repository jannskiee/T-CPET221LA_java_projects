public class Operation {
    private int a;
    private int b;
    private int large;
    private int sum;

    public void setNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public void large() {
        if (a > b) {
            large = a;
        } else {
            large = b;
        }
        System.out.println("Large: " + large);
    }
}
