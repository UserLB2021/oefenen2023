package ExamenIDOO1_2023;

public class ArrayVullenApp {

    public static void main(String[] args) {

        ArrayVullen arrayVullen = new ArrayVullen();           //instantie van klasse ArrayVullen en stop in variabele.

        int[] gemaakteArray= arrayVullen.maakArray();           //Roep method maakArray() van de klasse ArrayVullen aan en vang geretourneerde waarde op in variabele.
        int[] aangepasteArray = arrayVullen.veranderArray(gemaakteArray);   //Roep method veranderArray() van de klasse ArrayVullen aan met argument de geretourneerde array van de method maakArray().
                                                                            //Vang de geretourneerde array van deze method weer op in een variable.

        int optellen = 0;                                       //tel de getallen uit die array op en print deze op console.
        for (int i = 0; i < aangepasteArray.length; i++) {
            optellen = optellen + aangepasteArray[i];

            System.out.println(optellen);

        }

    }
}
