package Logic;

import java.util.ArrayList;
import java.util.List;


/**
 * Test Tehmes
 * Abstrakt => ?
 */
public class Themen {


    private List<String> wortListe;


    public Themen(){
        wortListe = new ArrayList<>();
        testWortListe();

    }

    public void testWortListe(){
        wortListe.add("Borderlands");
        wortListe.add("Lilie");
        wortListe.add("Martin");
    }


    public List<String> getWortListe() {
        return wortListe;
    }


    @Override
    public String toString() {
        return "Themen{" +
                "wortListe=" + wortListe +
                '}';
    }
}
