package HSL_oefen;

public class ArrayVullenApp {

    public static void main(String[] args) {

        ArrayVullen arrayVullen = new ArrayVullen();

        int[] gemaakteArray = arrayVullen.maakArray();
        int[] aangepasteArray = arrayVullen.veranderArray(gemaakteArray);

        int optellen = 0;
        for (int i = 0; i < aangepasteArray.length; i++) {
            optellen = optellen + aangepasteArray[i];

            System.out.println(optellen);

        }
    }
}
