package ExamenIDOO1_2023;

public class GebakWinkel {

    public static void main(String[] args) {

        Puddingbroodje puddingbroodje = new Puddingbroodje(3.55, true, true);

        Taart taart = new Taart(5.11, true);

        puddingbroodje.setPrijs(3.21);
        taart.setAantalKaarsjes(24);

        System.out.printf("%s %s %s\n", puddingbroodje.getPrijs(), puddingbroodje.isOpVooraad(), puddingbroodje.isHeeftExtraRoom());
        System.out.printf("%s %s %s\n", taart.getPrijs(), taart.isOpVooraad(), taart.getAantalKaarsjes());

    }
}
