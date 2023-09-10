package d07_09_2023;

//Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double).
// U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti.
// Ispisati informacije o proizvodima.

public class Zadatak3 {
    public static void main(String[] args) {

        Proizvod proizvod1 = new Proizvod();

        proizvod1.naziv = "Hleb";
        proizvod1.cena = 70.99;

        Proizvod proizvod2 = new Proizvod();

        proizvod2.naziv = "Mleko";
        proizvod2.cena = 120.99;

        Proizvod proizvod3 = new Proizvod();

        proizvod3.naziv = "Kafa";
        proizvod3.cena = 160.99;

        System.out.println("*****************");

        System.out.println("Naziv proizvoda: " + proizvod1.naziv);
        System.out.println("Cena: " + proizvod1.cena + " din");

        System.out.println("*****************");

        System.out.println("Naziv proizvoda: " + proizvod2.naziv);
        System.out.println("Cena: " + proizvod2.cena + " din");

        System.out.println("*****************");

        System.out.println("Naziv proizvoda: " + proizvod3.naziv);
        System.out.println("Cena: " + proizvod3.cena + " din");


    }
}
