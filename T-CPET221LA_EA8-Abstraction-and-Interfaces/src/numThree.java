// The following are the description of the variables in an abstract class.
// Apply encapsulation and abstraction to set and get the values of these variables.
// Display these data (for three countries CountryA, CountryB, CountryC) in the main program.
// Complete the sections with (?) UML diagram.
//      •	Country	- country name
//      •	population	- number of populations
//      •	infected	- number of infected
//      •	recovered	- number of recovered
//      •	ratioOfInfected – string ratio per one infected people. Example: A country has 1000 population with 10 infected.
// For every 100 people, 1 is infected. That is 1:100.

import java.util.Scanner;

public class numThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for CountryA: ");
        Country countryA = createCountryFromInput(scanner);

        System.out.println("\nEnter details for CountryB: ");
        Country countryB = createCountryFromInput(scanner);

        System.out.println("\nEnter details for CountryC: ");
        Country countryC = createCountryFromInput(scanner);

        displayCountryData(countryA);
        displayCountryData(countryB);
        displayCountryData(countryC);

        scanner.close();
    }

    private static Country createCountryFromInput(Scanner scanner) {
        System.out.print("Enter country name: ");
        String countryName = scanner.nextLine();

        System.out.print("Enter population: ");
        int population = scanner.nextInt();

        System.out.print("Enter infected: ");
        int infected = scanner.nextInt();

        System.out.print("Enter recovered: ");
        int recovered = scanner.nextInt();

        scanner.nextLine();

        return new Country(countryName, population, infected, recovered);
    }

    private static void displayCountryData(Country country) {
        System.out.println("\nCountry: " + country.getCountry());
        System.out.println("Population: " + country.getPopulation());
        System.out.println("Infected: " + country.getInfected());
        System.out.println("Recovered: " + country.getRecovered());
        System.out.println("Ratio of Infected: " + country.calculateRatioOfInfected());
        System.out.println();
    }
}
