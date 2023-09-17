package d15_09_2023;

//Kreirati klasu Osoba koja ima:
//-	ime i prezime
//-	jmbg
//-	godinu rodjenja
//-	default-ni konstuktor
//-	konstuktor sa parametrima
//-	gettere i settere
//-	metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
//
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//-	broj (broj koji igrac nosi)
//-	poziciju koju igra (odbrambeni, napadac, … )
//-	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//-	default-ni konstuktor
//-	konstuktor sa parametrima
//-	gettere i settere za broj, kapiten i poziciju
//-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//-	godine iskustva
//-	tip trenera (kondicioni, za igru, pomocni, personalni)
//-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode a zatim kreirati niz igraca i niz trenera,
//na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.

//BONUS
//Kreirati klasu Karton koja ima:
//        -	tip kartona (crveni, zuti)
//        -	konstuktore za koje mislite da ce vam trebati
//        -	gettere i settere za karton

//U glavnom programu kreirati igraca i dodati mu nekoliko kartona.

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Igrac>nizIgraca = new ArrayList<>();
        ArrayList<Trener>nizTrenera = new ArrayList<>();


        for (int i = 0; i < 2; i++) {
            System.out.println("Unesite ime igraca:");
            String imeIgraca = s.next();

            System.out.println("Unesite prezime igraca");
            String prezimeIgraca = s.next();

            System.out.println("Unesite JMBG igraca:");
            String jmbgIgraca = s.next();

            System.out.println("Unesite godinu rodjenja igraca:");
            int godinaRodjIgraca = s.nextInt();

            System.out.println("Unesite broj dresa koji igrac nosi:");
            int brojDresa = s.nextInt();

            System.out.println("Unesite poziciju na kojoj igra:");
            String pozicijaIgraca = s.next();

            System.out.println("Da li je kapiten");
            boolean daLiJeKapiten = s.nextBoolean();

            System.out.println("Unesite broj dobijenih kartona");
            int brojKartona = s.nextInt();


            ArrayList<KartonBonus>nizKartona = new ArrayList<>();

            for (int j = 0; j < brojKartona; j++) {

                System.out.println("Unesite karton");
                String bojaKartona = s.next();
                KartonBonus karton = new KartonBonus();
                karton.setKarton(bojaKartona);
                nizKartona.add(karton);
            }


            Igrac igrac = new Igrac(imeIgraca,prezimeIgraca,jmbgIgraca,godinaRodjIgraca,brojDresa,pozicijaIgraca,daLiJeKapiten,nizKartona);
            nizIgraca.add(igrac);

        }

        for (int i = 0; i < 2; i++) {

            System.out.println("Unesite ime trenera");
            String imeTrenera = s.next();

            System.out.println("Unesite prezime trenera");
            String prezimeTrenera = s.next();

            System.out.println("Unesite JMBG trenera");
            String jmbgTrenera = s.next();

            System.out.println("Unesite godinu rodjenja trenera");
            int godinaRodjTrenera = s.nextInt();

            System.out.println("Unesite godine iskustva trenera");
            int godineIskustva = s.nextInt();

            System.out.println("Unesite tip trenera");
            String tipTrenera = s.next();

            Trener trener = new Trener(imeTrenera,prezimeTrenera,jmbgTrenera,godinaRodjTrenera,godineIskustva,tipTrenera);
            nizTrenera.add(trener);

        }

        for (int i = 0; i < nizIgraca.size(); i++) {
            nizIgraca.get(i).stampanje();
        }

        for (int i = 0; i < nizIgraca.size(); i++) {
            nizTrenera.get(i).stampanje();
        }

    }
}
