package Opdrachten_HSL;

public class Auto {

    private String naam;
    private String kleur;
    private int verkoopprijs;

    public Auto(String naam, String kleur, int verkoopprijs) {
        this.naam = naam;
        this.kleur = kleur;
        this.verkoopprijs = verkoopprijs;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public int getVerkoopprijs() {
        return verkoopprijs;
    }

    public void setVerkoopprijs(int verkoopprijs) {
        this.verkoopprijs = verkoopprijs;
    }
}
