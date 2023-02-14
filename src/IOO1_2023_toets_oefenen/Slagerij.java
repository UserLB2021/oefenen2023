package IOO1_2023_toets_oefenen;

import java.util.Scanner;

public class Slagerij {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] vleesSoorten = {"Rund", "Lam", "Paard", "Varken", "Geit"};

        System.out.println("Welk vleessoort zou u graag gehad willen hebben? ");
        String input = scanner.next();


        boolean aanwezig = false;
        for (String soort : vleesSoorten) {
            if (input.equals(soort)) {
                aanwezig = true;
            }
        }
        if (aanwezig) {
            System.out.println("De vleessoort komt WEL voor in het assortiment. ");
        }
        else {
            System.out.println("De vleessoort komt NIET voor in het assortiment. ");
        }
    }
}


        /*boolean aanwezig = false;
        for (String vleesSoort : vleesSoorten) {
            if (input.equals(vleesSoort)){
                aanwezig = true;
            }
        }*/





