package d07_09_2023;

//Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String).
// U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature.
// Ispisati informacije o filmovima.

public class Zadatak4 {
    public static void main(String[] args) {

        Film movie1 = new Film();

        movie1.naslov = "Vrisak";
        movie1.godinaIzdanja = 1996;
        movie1.reziser = "Wes Craven";

        Film movie2 = new Film();

        movie2.naslov = "Dogma";
        movie2.godinaIzdanja = 1999;
        movie2.reziser = "Kevin Smith";

        Film movie3 = new Film();

        movie3.naslov = "Trumanov Sou";
        movie3.godinaIzdanja = 1998;
        movie3.reziser = "Peter Weir";


        System.out.println("*********************");

        System.out.println("Naziv filma: " + movie1.naslov);
        System.out.println("Godina izdanja: " + movie1.godinaIzdanja);
        System.out.println("Reziser: " + movie1.reziser);

        System.out.println("*********************");

        System.out.println("Naziv filma: " + movie2.naslov);
        System.out.println("Godina izdanja: " + movie2.godinaIzdanja);
        System.out.println("Reziser: " + movie2.reziser);

        System.out.println("*********************");

        System.out.println("Naziv filma: " + movie3.naslov);
        System.out.println("Godina izdanja: " + movie3.godinaIzdanja);
        System.out.println("Reziser: " + movie3.reziser);

    }
}
