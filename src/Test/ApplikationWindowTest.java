package Test;

import Window.ApplikationWindow;

import static org.junit.jupiter.api.Assertions.*;

class ApplikationWindowTest {


    private ApplikationWindow myWindow;
    private static String [] list = {"Borderlands","Jonas","Krokos"};



    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        myWindow = new ApplikationWindow();
    }


    @org.junit.jupiter.api.Test
    void isCharacerInString_Test1() {
        String wort_1 = list[0];
        boolean istTrue = myWindow.isCharacerInString("a",wort_1);
        assertTrue(istTrue);
    }

    @org.junit.jupiter.api.Test
    void isCharacerInString_Test2() {
        String wort_2 = list[2];
        boolean istFalse = myWindow.isCharacerInString("x",wort_2);
        assertFalse(istFalse);
    }



}