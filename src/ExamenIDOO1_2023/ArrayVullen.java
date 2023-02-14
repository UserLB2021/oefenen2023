package ExamenIDOO1_2023;

public class ArrayVullen {

    public int[] maakArray() {
        int[] cijfers = {5, 12, 33, -9, 14};

        return cijfers;
    }
    public int[] veranderArray(int[] gemaakteArray){        //maak een method veranderArray()
                                                            // met als argument: de getallen array die is gemaakt met de maakArray() method.
        gemaakteArray[1] = 6;                               //de method verandert de waarde in de getallen array //verander waarde 12 in waarde 6
        gemaakteArray[3] = gemaakteArray[3] + 2;            //Lees het vierde element uit array en tel er 2 bij op. schrijf waarde terug in de array.
                                                            //
        return gemaakteArray;                               //de method retourneert de veranderde getallen array.
    }

}
