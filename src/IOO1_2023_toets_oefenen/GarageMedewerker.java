package IOO1_2023_toets_oefenen;

public class GarageMedewerker {

    private String naam;
    private String woonplaats;
    private int geboortejaar;

    public GarageMedewerker(String naam, String woonplaats, int geboortejaar) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.geboortejaar = geboortejaar;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public int getGeboortejaar() {
        return geboortejaar;
    }

    public void setGeboortejaar(int geboortejaar) {
        this.geboortejaar = geboortejaar;
    }
    public int getLeeftijd() {
        return 2021 - this.geboortejaar;
    }
}
