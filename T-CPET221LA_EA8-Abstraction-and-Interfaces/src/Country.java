class Country extends NCOV {
    public Country(String country, int population, int infected, int recovered) {
        super(country, population, infected, recovered);
    }

    @Override
    public String calculateRatioOfInfected() {
        int ratioDenominator = getPopulation() / 100;
        return "1:" + ratioDenominator;
    }
}