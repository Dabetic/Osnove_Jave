package p15_09_2023;

// Napraviti klasu PlatnaKartica koja ima
////  atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
////  atribut broj kartice  primer: 4012-1239-1221-3381
////  atribut godina - godina do kada vazi kartica
////  atribut mesec-  mesec do kada vazi kartica
////  konstruktor sa parametrima
////  gettere za sve atribute, bez settera
////   metodu dodajSredstva koja povecava sumu za unetu vrednost
////  metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
////  metodu koja stampa podatke o kartici u formatu:
////	  4012-1239-1221-3381, 11/2019, $212
public abstract class PlatnaKartica {

    protected int suma;
    protected String brojKartice;
    protected int godinaVaznjaKartice;
    protected int mesecVazenjaKartice;

    public PlatnaKartica () {

    }
    public PlatnaKartica(int suma, String brojKartice, int godinaVaznjaKartice, int mesecVazenjaKartice) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godinaVaznjaKartice = godinaVaznjaKartice;
        this.mesecVazenjaKartice = mesecVazenjaKartice;
    }

    public int getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getGodinaVaznjaKartice() {
        return godinaVaznjaKartice;
    }

    public int getMesecVazenjaKartice() {
        return mesecVazenjaKartice;
    }

    public void dodajSredstva (int iznos) {
        suma += iznos;
    }

    public void izvrsiTransakciju (int iznos) {
        suma -= iznos;
    }

    public abstract void stampanje();
//    {
//        System.out.println(this.brojKartice + " " + this.mesecVazenjaKartice + "/" + this.godinaVaznjaKartice + " $" + this.suma);
//    }

}
