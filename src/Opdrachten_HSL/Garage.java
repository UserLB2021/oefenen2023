package Opdrachten_HSL;
public class Garage {
    private int startkapitaal;
    private Auto[] voorraad = {
            new Auto("Rolce Royce", "Zilver", 100000),
            new Auto("Batmobiel", "Zwart", 250000),
            new Auto("Catmobile", "Zwart", 200000),
            new Auto("Kawasaki Ninja (Motor)", "Blauw", 15000),
            new Auto("Kawasaki Ninja (Motor)","Rood",10000),
            };

    private Klant[] klanten;

    public Garage(int startkapitaal, Auto[] voorraad, Klant[] klanten) {
        this.startkapitaal = startkapitaal;
        this.voorraad = voorraad;
        this.klanten = klanten;
    }


    public int getStartkapitaal() {
        return startkapitaal;
    }

    public void setStartkapitaal(int startkapitaal) {
        this.startkapitaal = startkapitaal;
    }

    public Auto[] getVoorraad() {
        return voorraad;
    }

    public void setVoorraad(Auto[] voorraad) {
        this.voorraad = voorraad;
    }

    public Klant[] getKlanten() {
        return klanten;
    }

    public void setKlanten(Klant[] klanten) {
        this.klanten = klanten;
    }

    public static void main(String[] args) {






    }
}
