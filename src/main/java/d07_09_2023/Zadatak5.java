package d07_09_2023;

////Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double).
////U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti unosom sa tasture.
////Ispisati informacije o opremi.

public class Zadatak5 {
    public static void main(String[] args) {

        Oprema predmet1 = new Oprema();

        predmet1.tip = "Patike za trcanje";
        predmet1.marka = "Nike";
        predmet1.cena = 1220.99;

        Oprema predmet2 = new Oprema();

        predmet2.tip = "Trenerka";
        predmet2.marka = "Adidas";
        predmet2.cena = 1411.99;

        Oprema predmet3 = new Oprema();

        predmet3.tip = "Kacket";
        predmet3.marka = "Puma";
        predmet3.cena = 2200.33;


        System.out.println("*******************");

        System.out.println("Tip opreme: " + predmet1.tip);
        System.out.println("Marka: " + predmet1.marka);
        System.out.println("Cena: " + predmet1.cena + " din");

        System.out.println("*******************");

        System.out.println("Tip opreme: " + predmet2.tip);
        System.out.println("Marka: " + predmet2.marka);
        System.out.println("Cena: " + predmet2.cena + " din");

        System.out.println("*******************");

        System.out.println("Tip opreme: " + predmet3.tip);
        System.out.println("Marka: " + predmet3.marka);
        System.out.println("Cena: " + predmet3.cena + " din");

    }
}
