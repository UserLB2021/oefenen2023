package HSL_Ondersteuning_IOO1;

public class Telefoon {

    private String merk;
    private String type;
    private String imei;
    private String imsi;
    private String goedNummer;

    public Telefoon(String merk) {
        this.merk = merk;
        this.type = type;
        this.imei = imei;
        this.imsi = imsi;
        this.goedNummer = goedNummer;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getGoedNummer() {
        return goedNummer;
    }

    public void setGoedNummer(String goedNummer) {
        this.goedNummer = goedNummer;
    }
}
