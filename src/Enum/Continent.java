package Enum;

public enum Continent {
    ASIA(44614000,4700000000L),
    AFRICA(30365000,1400000000L),
    NORTH_AMERICA(24230000,60000000L),
    SOUTH_AMERICA(17814000,43000000L),
    ANTARCTICA(14200000,0),
    EUROPE(10000000,75000000L),
    OCEANIA(8511000,4000000L);

    private int area;
    private long population;

    Continent(int area, long population) {
        this.area = area;
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public long getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "area=" + area +
                ", population=" + population +
                '}';
    }

    public static Continent getLargestContinent() {
        Continent[] continents = values();
        Continent largestContinent = null;
        for (Continent continent: continents) {
           if (largestContinent == null || largestContinent.area < continent.area){
               largestContinent = continent;
           }

        }
        return largestContinent;
    }
    public static Continent getSmallestContinent() {
        Continent[] continents = values();
        Continent smallestContinent = null;
        for (Continent continent: continents) {
            if (smallestContinent == null || smallestContinent.area > continent.area){
                smallestContinent = continent;
            }
        }
        return smallestContinent;
    }
}

