package d12_09_2023;

//Kreirati klasu ZeleniKarton koja ima:
//●	ime i prezime studenta
//●	broj indeksa
//●	naziv predmeta
//●	ime i prezime profesora
//●	ocenu - od 5 do 10
//●	gettere i settere
//●	konstruktore
//●	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//●	metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//●	kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
//●	Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<ZeleniKarton>nizZelKartona = new ArrayList<>();

        ZeleniKarton zeleniKarton1 = new ZeleniKarton("Mirko Mirkovic", 2457, "Biologija", "Pavle Pavlovic", 8);
        ZeleniKarton zeleniKarton2 = new ZeleniKarton("Stefan Mirkovic", 2713, "Biologija", "Pavle Pavlovic", 9);
        ZeleniKarton zeleniKarton3 = new ZeleniKarton("Branko Brankovic", 2486, "Biologija", "Pavle Pavlovic", 8);
        ZeleniKarton zeleniKarton4 = new ZeleniKarton("Janko Brankovic", 2751, "Biologija", "Pavle Pavlovic", 7);
        ZeleniKarton zeleniKarton5 = new ZeleniKarton("Zivko Markovic", 2362, "Biologija", "Pavle Pavlovic", 6);


        nizZelKartona.add(zeleniKarton1);
        nizZelKartona.add(zeleniKarton2);
        nizZelKartona.add(zeleniKarton3);
        nizZelKartona.add(zeleniKarton4);
        nizZelKartona.add(zeleniKarton5);

        int ukupno = 0;

        for (int i = 0; i < 5; i++) {
            nizZelKartona.get(i).stampanje();
            ukupno +=  nizZelKartona.get(i).getOcena();
        }

        double prosecnaOcena = ukupno * 1.0 / 5;

        System.out.println("Prosecna ocena: " + prosecnaOcena);

    }
}
