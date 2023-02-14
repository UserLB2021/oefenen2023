package IOO1_2023_toets_oefenen;

public class SportArtikel {

    double prijs;
    boolean inStock;

    public SportArtikel(double prijs, boolean inStock) {
        this.prijs = prijs;
        this.inStock = inStock;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
