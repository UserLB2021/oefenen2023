package ExamenIDOO1_2023;

public class Puddingbroodje extends Gebak {

    boolean heeftExtraRoom;

    public Puddingbroodje(double prijs, boolean opVooraad, boolean heeftExtraRoom) {
        super(prijs, opVooraad);
        this.heeftExtraRoom = heeftExtraRoom;
    }

    public boolean isHeeftExtraRoom() {
        return heeftExtraRoom;
    }

    public void setHeeftExtraRoom(boolean heeftExtraRoom) {
        this.heeftExtraRoom = heeftExtraRoom;
    }
}
