package ExamenIDOO1_2023;

public class GetalTest {                    //Klasse GetalTest

    public String testGetal(int getal){     //Maak method testGetal() met argument: geheel getal
        String totaalgetal = "";
        if (getal < 200) {
            totaalgetal = totaalgetal + "1";
        }
        if (getal == 4444) {
            totaalgetal = totaalgetal + "2";
        }
        if (getal > 300 && getal < 335) {
            totaalgetal = totaalgetal + "3";
        }
        if (getal % 10 == 0 || getal % 15 == 0) {
            totaalgetal = totaalgetal + "4";
        }
        if (totaalgetal.equals("")){
            totaalgetal = "0";
        }
        return totaalgetal;
    }
}
