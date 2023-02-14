package ExamenIDOO1_2023;

import java.util.Scanner;

public class GetalTestApp {                                                     //maak klasse GetalTestApp
    public static void main(String[] args) {                                    //main
        Scanner scanner = new Scanner(System.in);                               //vraag met scanner object een geheel getal aan de gebruiker.
        GetalTest getalTest = new GetalTest();                                  //instantie van GetalTest

        System.out.println("Op welk getal wilt u testen? ");                    //vraag printen
        int gekozenGetal = scanner.nextInt();                                   //vang returnwaarde op / van invoer op

        System.out.println(getalTest.testGetal(gekozenGetal));                  //print returnwaarde op je console
    }
}

//programma hoeft maar 1 x te draaien. Zorg wel dat je alle inputs test.
