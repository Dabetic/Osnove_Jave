package d14_09_2023;

import java.util.ArrayList;

//Napisati klasu Student koja ima
//
//●	broj indeksa
//●	ime i prezime
//●	tip studija (osnovne, master, doktorske)
//●	niz ispita
//●	konstuktore koje mislite da ce vam trebati
//●	gettere i settere za indeks, ime i prezime, tip studija
//●	getter za niz predmeta
//●	metodu dodaj ispit u niz ispita
//●	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//●	metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
public class Student {

    private String imeIprezime;
    private int brojIndeksa;
    private String tipStudija;
    private ArrayList<Ispit>nizIspita;


    public Student() {
    }

    public Student(String imeIprezime, int brojIndeksa, String tipStudija) {
        this.imeIprezime = imeIprezime;
        this.brojIndeksa = brojIndeksa;
        this.tipStudija = tipStudija;
        this.nizIspita = new ArrayList<>();
    }

    public void dodavanjeIspita (Ispit dodajIspit) {
        nizIspita.add(dodajIspit);
    }

    public double racunanjeProseka () {
        double prosek = 0;
        double brojac = 0;
        for (int i = 0; i < nizIspita.size(); i++) {
            if(nizIspita.get(i).daLiJeIspitPolozen()) {
                brojac += 1;
                prosek = (prosek + nizIspita.get(i).getOcena());
            }

        }
        return prosek / brojac;
    }
    public void stampanje () {
        System.out.println("Broj indeksa: " + this.brojIndeksa + " - Student: " + this.imeIprezime + " - Tip studija: " + this.tipStudija);
        for (int i = 0; i < nizIspita.size(); i++) {nizIspita.get(i).stampanjeIspita();
        }
        System.out.println("Prosecna ocena: " + racunanjeProseka());
    }

}
