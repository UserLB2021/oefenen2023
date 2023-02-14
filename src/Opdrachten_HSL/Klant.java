package Opdrachten_HSL;

public class Klant {

    private int id;
    private String naam;
    private int bedrag;
    private Auto auto;

    public Klant(int id, String naam, int bedrag) {
        this.id = id;
        this.naam = naam;
        this.bedrag = bedrag;
    }

    public Klant(int id, String naam, int bedrag, Auto auto) {
        this.id = id;
        this.naam = naam;
        this.bedrag = bedrag;
        this.auto = auto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getBedrag() {
        return bedrag;
    }

    public void setBedrag(int bedrag) {
        this.bedrag = bedrag;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
}
