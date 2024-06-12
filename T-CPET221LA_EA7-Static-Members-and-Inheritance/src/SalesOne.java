public class SalesOne {
    public int first;
    public int second;
    public int total;

    public int overall;

    SalesOne(int first, int second) {
        this.first = first;
        this.second = second;
    }


    public void compute() {
        total = first + second;
    }

    public int totalSales() {
        return total;
    }

    public void overallSales(SalesOne obj2) {
        overall = total + obj2.totalSales();
        System.out.println("\nThe overall sales from two companies is: " + overall);
    }
}
