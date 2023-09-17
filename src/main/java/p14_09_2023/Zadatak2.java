package p14_09_2023;

//Zadatak
//	Kreirati klasu Reakcija koja ima
//tip reakcije (smajli, like, srce)
//ime i prezime korisnika koji je reagovao
//gettere, settere i konstruktore
//
//Kreirati klasu FacebookPost koja ima:
//ime i prezime korisnika koji je stavio oglas
//tekst objave
//niz reakcija
//metodu reaguj, koja dodaje reakciju u niz
//Ukoliko se desi situacija da jedan isti korisnik reaguje na post (tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
//Primer: Milan - lajkuje
//	 Nemanja - lajkuje
//	 Milan - daje srce
//Post ima lajk od Nemanje i srce od Milana.
//privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//
//brojReakcija(“smajli) => 3
//brojReakcija(“srce”) => 2
//brojReakcija(“like”) => 1
//brojReakcija(“cry”) => 0
//
//
//metodu stampaj koja stampa podatke u formatu:
//ime i prezime
//tekst objave
//Smajli 10 | Like 15 | Srce 2

public class Zadatak2 {
    public static void main(String[] args) {
        Reakcija reakcija1 = new Reakcija("Milos D", "lajk");
        Reakcija reakcija2 = new Reakcija("Milan M", "srce");
        FacebookPost objava1 = new FacebookPost();

        objava1.setImeIPrezimeKorisnikaKojiStavljaObjavu("Miljan M");
        objava1.setTekstObjave("Lep je dan");

        objava1.reaguj(reakcija1);
        objava1.reaguj(reakcija2);

        objava1.stampanje();

    }
}
