package ExamenIDOO1_2023;

public class Gebak {

    private double prijs;
    private boolean opVooraad;

    public Gebak(double prijs, boolean opVooraad) {
        this.prijs = prijs;
        this.opVooraad = opVooraad;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public boolean isOpVooraad() {
        return opVooraad;
    }

    public void setOpVooraad(boolean opVooraad) {
        this.opVooraad = opVooraad;
    }
}
