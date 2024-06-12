// Superman travels 2000m/s. Compute and display (in km)
// how far he will travel for an hour.

public class numOne {
    public static void main(String[] args) {
        double speed = 2000;
        double time = 3600;
        double distance = speed * time;
        System.out.println("Superman will travel " + distance/1000 + " km in an hour.");
    }
}