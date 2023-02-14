package ExamenIDOO1_2023;

public class Taart extends Gebak {

    int aantalKaarsjes = 0;

    public Taart(double prijs, boolean opVooraad) {
        super(prijs, opVooraad);
        this.aantalKaarsjes = aantalKaarsjes;
    }

    public int getAantalKaarsjes() {
        return aantalKaarsjes;
    }

    public void setAantalKaarsjes(int aantalKaarsjes) {
        this.aantalKaarsjes = aantalKaarsjes;
    }

}
