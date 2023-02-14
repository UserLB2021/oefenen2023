package IOO1_2023_toets_oefenen;

public class SportWinkelApp {

    public static void main(String[] args) {
        SportSchoen sportSchoen = new SportSchoen(50.0, true, "tennis");
        SportShirt sportShirt = new SportShirt(20.0, false, true);

        sportSchoen.setPrijs(55.0);

        System.out.printf("%s %s %s\n", sportSchoen.getType(), sportSchoen.getPrijs(), sportSchoen.isInStock());
        System.out.printf("%s %s %s\n", sportShirt.getPrijs(), sportShirt.isInStock(), sportShirt.isBedrukt());

    }
}
