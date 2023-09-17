package p14_09_2023;

import java.util.ArrayList;

//ID
//naziv
//niz test koraka
//metodu addTestStep koja dodaje test step u niz
//metodu koja vraca broj test stepova koji su failovali (oni kod kojih actual vrednost nije jednaka sa expected)
//metodu koja vraca stanje testcase-a. Ukoliko nema koraka koji su failovali metoda vraca “PASSED” u suprotnom “FAILED”
//metoda koja stampa status test case-a u formatu
//ID - Naziv
//|  Opis  |
//|  Status(failed ili passed) | Error message (ako je test step failovao)
//|  Opis  |
//|  Status(failed ili passed) | Error message (ako je test step failovao)
//|  Opis  |
//|  Status(failed ili passed) | Error message (ako je test step failovao)
//ukupan broj koraka / broj test caseva koji su faulovali
//Stanje test case-a (PASSED ILI FALED)
public class TestCase {

    private int id;
    private String nazivTc;
    private ArrayList<TestStep>nizTestStepova;

    public TestCase() {
        nizTestStepova = new ArrayList<>();
    }

    public void dodajTestKejs (TestStep unesiTs) {
        nizTestStepova.add(unesiTs);
    }

    public int fejlovaniTestStepovi () {
        int brojac = 0;
        for (int i = 0; i < nizTestStepova.size(); i++) {
            if(!nizTestStepova.get(i).daLiSuStvarneIOcekivaneJednake()) {
                brojac++;
            }
        }
        return brojac;
    }

    public String izracunajStanjeDaLiJePaoIliProso () {
        int brojacFejlovanih = 0;
        for (int i = 0; i < nizTestStepova.size(); i++) {
            if(!nizTestStepova.get(i).daLiSuStvarneIOcekivaneJednake()) {
                brojacFejlovanih++;
            }
        }
        if(brojacFejlovanih>0) {
            return "Failed";
        } else {
            return "Passed";
        }

    }
    public void stampanje() {

        for (int i = 0; i < nizTestStepova.size(); i++) {
            nizTestStepova.get(i).stampanje();
        }
        System.out.println("Broj palih testova: " + this.fejlovaniTestStepovi());
        System.out.println("Status tc: " + this.izracunajStanjeDaLiJePaoIliProso());
    }
}
