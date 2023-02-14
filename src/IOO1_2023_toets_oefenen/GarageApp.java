package IOO1_2023_toets_oefenen;

public class GarageApp {

    public static void main(String[] args) {

        GarageMedewerker mw1 = new GarageMedewerker("Albert van der Vecht", "Leiden", 1990);
        GarageMedewerker mw2 = new GarageMedewerker("Carla Heemskerk", "Voorschoten", 1995);
        GarageMedewerker mw3 = new GarageMedewerker("Romee van der Horn", "Zoetermeer", 1987);

        mw1.setGeboortejaar(1980);
        mw2.setNaam("Carla Jansen-Heemskerk");
        mw3.setWoonplaats("Oestgeest");

        System.out.printf("Medewerker %s woont in %s en is %d jaar oud.\n", mw1.getNaam(), mw1.getWoonplaats(), mw1.getLeeftijd());
        System.out.printf("Medewerker %s woont in %s en is %d jaar oud.\n", mw2.getNaam(), mw2.getWoonplaats(), mw2.getLeeftijd());
        System.out.printf("Medewerker %s woont in %s en is %d jaar oud.\n", mw3.getNaam(), mw3.getWoonplaats(), mw3.getLeeftijd());

    }
}
