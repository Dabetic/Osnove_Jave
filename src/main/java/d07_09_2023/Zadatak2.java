package d07_09_2023;

//Napišite klasu "Automobil" sa atributima: marka (String),
// model (String) i godinaProizvodnje (int). U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti.
// Ispisati informacije o automobilima.

public class Zadatak2 {
    public static void main(String[] args) {

        Automobil auto1 = new Automobil();

        auto1.markaAuto = "Skoda";
        auto1.model = "Fabia";
        auto1.godinaProizvodnje = 2008;


        Automobil auto2 = new Automobil();

        auto2.markaAuto = "BMW";
        auto2.model = "Z3";
        auto2.godinaProizvodnje = 2001;


        Automobil auto3 = new Automobil();

        auto3.markaAuto = "Audi";
        auto3.model = "A6";
        auto3.godinaProizvodnje = 2005;


        System.out.println("*********************");

        System.out.println("Marka automobila: " + auto1.markaAuto);
        System.out.println("Model: " + auto1.model);
        System.out.println("Godiste: " + auto1.godinaProizvodnje);

        System.out.println("*********************");

        System.out.println("Marka automobila: " + auto2.markaAuto);
        System.out.println("Model: " + auto2.model);
        System.out.println("Godiste: " + auto3.godinaProizvodnje);


        System.out.println("*********************");

        System.out.println("Marka automobila: " + auto3.markaAuto);
        System.out.println("Model: " + auto3.model);
        System.out.println("Godiste: " + auto3.godinaProizvodnje);



    }
}
