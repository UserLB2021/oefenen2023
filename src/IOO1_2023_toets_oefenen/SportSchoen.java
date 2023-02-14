package IOO1_2023_toets_oefenen;

public class SportSchoen extends SportArtikel {

    String type;

    public SportSchoen(double prijs, boolean inStock, String type) {
        super(prijs, inStock);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

