package IOO1_2023_toets_oefenen;

public class SportShirt extends SportArtikel {

    boolean bedrukt;

    public SportShirt(double prijs, boolean inStock, boolean bedrukt) {
        super(prijs, inStock);
        this.bedrukt = bedrukt;
    }
       public boolean isBedrukt() {
        return bedrukt;
    }

    public void setBedrukt(boolean bedrukt) {
        this.bedrukt = bedrukt;
    }
}
