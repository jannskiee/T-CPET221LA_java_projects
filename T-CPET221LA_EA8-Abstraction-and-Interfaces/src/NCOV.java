abstract class NCOV {
    private String country;
    private int population;
    private int infected;
    private int recovered;

    public NCOV(String country, int population, int infected, int recovered) {
        this.country = country;
        this.population = population;
        this.infected = infected;
        this.recovered = recovered;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getInfected() {
        return infected;
    }

    public void setInfected(int infected) {
        this.infected = infected;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public abstract String calculateRatioOfInfected();
}