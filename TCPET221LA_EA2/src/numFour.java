// Display like the figure where the number = 5.
// *****
// *****
// *****
// *****
// *****

public class numFour {
    public static void main(String[] args) {
        int number = 5;

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
