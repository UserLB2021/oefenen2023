package ExamenIDOO1_2023;

public class Reservering {

    String naam;
    String reserveringsTijd;
    int aantalGasten;

    public Reservering(String naam, String reserveringsTijd, int aantalGasten) {
        this.naam = naam;
        this.reserveringsTijd = reserveringsTijd;
        this.aantalGasten = aantalGasten;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getReserveringsTijd() {
        return reserveringsTijd;
    }

    public void setReserveringsTijd(String reserveringsTijd) {
        this.reserveringsTijd = reserveringsTijd;
    }

    public int getAantalGasten() {
        return aantalGasten;
    }

    public void setAantalGasten(int aantalGasten) {
        this.aantalGasten = aantalGasten;
    }
    public String isAanDeBeurt(String huidigeTijd){         //maak een methode isAanDeBeurt(), die een huidigeTijd parameter ontvangt als String.
        if (huidigeTijd.equals(reserveringsTijd)) {
            return "is nu aan de beurt";
        }
        else {
            return "is nog niet aan de beurt";
        }

        }
}
