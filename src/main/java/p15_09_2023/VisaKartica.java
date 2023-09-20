package p15_09_2023;

// ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.
//getter i setter za ovlasceno lice
//konstruktor sa parametrima
//  implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume. Najmanja provizija moze biti $4.
//  implementira metodu koja stampa podatke o kartici u formatu:
//	  Visa Card: 4012-1239-1221-3381, 11/2019, $212
public class VisaKartica extends PlatnaKartica {

    private String ovalcenoLice;

    public VisaKartica(int suma, String brojKartice, int godinaVaznjaKartice, int mesecVazenjaKartice, String ovalcenoLice) {
        super(suma, brojKartice, godinaVaznjaKartice, mesecVazenjaKartice);
        this.ovalcenoLice = ovalcenoLice;
    }



    public void provizije (int provizija) {
      suma += provizija;
    }

    @Override
    public void stampanje () {
//        super.stampanje();
        System.out.println("Ovlasceno lice: " + ovalcenoLice);
    }


}


