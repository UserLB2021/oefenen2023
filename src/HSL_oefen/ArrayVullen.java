package HSL_oefen;

public class ArrayVullen {

    public int[] maakArray() {
        int[] cijfers = {5, 12, 33, -9, 14};

        return cijfers;
    }

    public int[] veranderArray(int[] gemaakteArray) {

        gemaakteArray[1] = 6;
        gemaakteArray[3] = gemaakteArray[3] + 2;
        return gemaakteArray;
    }
}



