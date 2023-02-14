package HSL_Ondersteuning_IOO1;

import java.util.Scanner;

public class GoedRegistratieApp {



    public static void main(String[] args) {

        Telefoon eenTelefoon = new Telefoon("Apple");
        Scanner invoer = new Scanner(System.in);

        eenTelefoon.setImei(invoer.nextLine());

        String hetImeiNummer = eenTelefoon.getImei();









        System.out.println("Hello world!");
    }
}