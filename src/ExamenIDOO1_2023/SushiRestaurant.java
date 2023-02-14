package ExamenIDOO1_2023;

public class SushiRestaurant {

    public static void main(String[] args) {

        String huidigeTijd = "17:30";

        Reservering reservering1 = new Reservering("De Jonge", "18:30", 5);
        Reservering reservering2 = new Reservering("Spijkers", "17:30", 2);
        Reservering reservering3 = new Reservering("Admiraal", "19:30", 4);

        reservering1.setNaam("De Ligt");
        reservering2.setAantalGasten(3);
        reservering3.setReserveringsTijd("20:00");

        //Print nu de informatie van alle drie de reserveringen uit. Gebruik hiervoor de juiste get-methoden en de isAandeBeurt() methode, die de huidigeTijd variabele meekrijgt.

        System.out.printf("Reservering van %s komt om %s en heeft %d gasten en %s\n",
                reservering1.getNaam(), reservering1.getReserveringsTijd(), reservering1.getAantalGasten(), reservering1.isAanDeBeurt(huidigeTijd));

        System.out.printf("Reservering van %s komt om %s en heeft %s gasten en %s\n",
                reservering2.getNaam(), reservering2.getReserveringsTijd(), reservering2.getAantalGasten(), reservering2.isAanDeBeurt(huidigeTijd));

        System.out.printf("Reservering van %s komt om %s en heeft %s gasten en %s\n",
                reservering3.getNaam(), reservering3.getReserveringsTijd(), reservering3.getAantalGasten(), reservering3.isAanDeBeurt(huidigeTijd));

    }
}
