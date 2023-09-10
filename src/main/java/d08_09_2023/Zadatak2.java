package d08_09_2023;

//Kreirati klasu FacebookPost koja ima:
//   Od atributa:
//-	ime i prezime korisnika koji je objavio post
//-	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//-	tekst objave
//-	broj lajkova
//-	broj deljenja
//  Od metoda:
//-	like(), koja povecava broj lajkova za 1.
//-	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//-	share(), koja povecava broj deljenja za 1
//-	print(), koja stampa objavu u formatu:
//(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//(tekst objave)
//Likes (broj lajkova) | Shares (broj deljenja)
//
//U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.

public class Zadatak2 {
    public static void main(String[] args) {

        FacebookPost osobaObavljivac = new FacebookPost();

        osobaObavljivac.imeOsobeObjavljivac = "Milos Dabetic";
        osobaObavljivac.brojLajkova = 10;
        osobaObavljivac.brojDeljenja = 3;
        osobaObavljivac.tekstObajve = "Jel gleda neko utakmicu?";
        osobaObavljivac.imeOsobeNaCijemProfilu = "Milan Milanovic";

        osobaObavljivac.srampanje();

        osobaObavljivac.like("like");
        osobaObavljivac.dislike("dislike");
        osobaObavljivac.dislike("dislike");
        osobaObavljivac.share("share");

        osobaObavljivac.srampanje();

        FacebookPost osobaObjavljivac2 = new FacebookPost();

        osobaObjavljivac2.imeOsobeObjavljivac = "Stefan Stefanovic";
        osobaObjavljivac2.brojLajkova = 14;
        osobaObjavljivac2.brojDeljenja = 7;
        osobaObjavljivac2.tekstObajve = "Zasto sad ne radi RTS planeta, za sta placamo pretplatu?";
        osobaObjavljivac2.imeOsobeNaCijemProfilu = "Miljan Vuckovic";

        osobaObjavljivac2.srampanje();

        osobaObjavljivac2.like("like");
        osobaObjavljivac2.like("like");
        osobaObjavljivac2.dislike("dislike");
        osobaObjavljivac2.share("share");

        osobaObjavljivac2.srampanje();

    }
}
