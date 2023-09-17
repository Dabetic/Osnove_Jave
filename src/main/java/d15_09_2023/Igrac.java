package d15_09_2023;

////Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
////-	broj (broj koji igrac nosi)
////-	poziciju koju igra (odbrambeni, napadac, … )
////-	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
////-	default-ni konstuktor
////-	konstuktor sa parametrima
////-	gettere i settere za broj, kapiten i poziciju
////-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
////
////Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
////-	godine iskustva
////-	tip trenera (kondicioni, za igru, pomocni, personalni)
////-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

import java.util.ArrayList;

public class Igrac extends Osoba {


    private int brojKojiIgracNosi;
    private String pozicijaNaKojojIgra;
    private boolean daLiJeKapiten;
    private ArrayList<KartonBonus>nizKartona;


    public Igrac() {
        super();
        this.nizKartona = new ArrayList<>();
    }

    public Igrac(String ime,String prezime, String jmbg, int godinaRodjenja, int brojKojiIgracNosi,
                 String pozicijaNaKojojIgra, boolean daLiJeKapiten, ArrayList nizKartona) {
        super(ime, prezime, jmbg, godinaRodjenja);
        this.brojKojiIgracNosi = brojKojiIgracNosi;
        this.pozicijaNaKojojIgra = pozicijaNaKojojIgra;
        this.daLiJeKapiten = daLiJeKapiten;
        this.nizKartona = nizKartona;
    }

    public void stampanje () {
        super.stampanje();
        System.out.println("Broj koji igrac nosi: " + brojKojiIgracNosi);
        System.out.println("Pozicija: " + pozicijaNaKojojIgra);
        if(this.daLiJeKapiten){
            System.out.println("Kapiten tima");
        } else {
            System.out.println("Nije kapiten tima");
        }
        for (int i = 0; i < nizKartona.size(); i++) {
            System.out.println("Dobijeni karton: " + nizKartona.get(i).getKarton());
        }

        System.out.println("*************");
    }
}
