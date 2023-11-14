package Enum;

public class Main {
    public static void main(String[] args) {
        System.out.println(Continent.getLargestContinent());

        System.out.println("All continents are:  ");
        Continent[] allContinents = Continent.values();
        for (Continent continent : allContinents){
            System.out.println(continent);
        }

        Continent asia = Continent.ASIA;
        System.out.println("Asia has: " + asia.getArea());

        System.out.println("Africa has: " + Continent.AFRICA.getPopulation());


        Continent europe = Continent.valueOf("EUROPE");
        System.out.println("Europe has: " + europe.getPopulation());
    }
}
