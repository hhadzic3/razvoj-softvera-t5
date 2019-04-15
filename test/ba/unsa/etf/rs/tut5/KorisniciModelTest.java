package ba.unsa.etf.rs.tut5;

import javafx.collections.ObservableList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorisniciModelTest {
    private static KorisniciModel model = null;

    @BeforeAll
    static void setup(){
        model = new KorisniciModel();
        model.napuni();
    }

    @Test
    void ProvjeraBrojaKorisnika(){
        model.setKorisnik(model.getKorisnik());
        assertEquals(3 , model.getKorisnik().size());
    }

    @Test
    void novogKorisnika(){

        ObservableList<Korisnik> novi = model.getKorisnik();
        novi.add(new Korisnik("semso" , "semsic" , "mail" , "asdas" , "sadas"));
        assertEquals(4 , model.getKorisnik().size());
    }


    /*@Test
    void novogKorisnika2(){

        model.dodajKorisnika(new Korisnik("semso" , "mehic" , "sadasd" , "sadas" , "sadsa") );
        assertEquals(5 , model.getKorisnik().size());
    }*/


}