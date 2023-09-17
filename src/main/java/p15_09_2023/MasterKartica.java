package p15_09_2023;

//Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
//  konstruktor sa parametrima
//  implementira metodu koja vrsi transakciju, tako da na prosledjenu sumu dodaje proviziju od 1.5 posto na sumu.
//  metoda naplatiOdrzavanje, koja sa racuna skida $2.
//  implementira metodu koja stampa podatke o kartici u formatu:
//	  Master Card: 12/2019, 4012-1239-1221-3381, $232
//	  u main funkciji, napraviti visa i master kartice i testirati funkcije
public class MasterKartica extends PlatnaKartica {

    private String ovlacenoLice;

    public MasterKartica() {
    }

    public MasterKartica(int suma, String brojKartice, int godinaVaznjaKartice, int mesecVazenjaKartice, String ovlascenoLice) {
        super(suma, brojKartice, godinaVaznjaKartice, mesecVazenjaKartice);
        this.ovlacenoLice = ovlascenoLice;
    }

    public void naplataProvizije (int provizija) {
        suma += provizija;
    }
    @Override
    public void stampanje () {
     super.stampanje();
        System.out.println("Ovlasceno lice: " + ovlacenoLice);
    }
}
