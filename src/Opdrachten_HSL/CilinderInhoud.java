package Opdrachten_HSL;

import java.util.Scanner;

public class CilinderInhoud {


    public static void main(String[] args) {

        final double PI = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Inhoud van een cilinder wordt berekend.");

        System.out.println("Wat is de straal? ");
        double straal = input.nextDouble();
        System.out.println("Wat is de hoogte? ");
        double hoogte = input.nextDouble();

        double inhoud = straal * straal * PI * hoogte;

        System.out.println("De inhoud van de cilinder is:  " + inhoud);
    }
}