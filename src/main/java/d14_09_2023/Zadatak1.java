package d14_09_2023;

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
//
//
//Napisati klasu Ispit koja ima
//●	naziv predmeta
//●	ocenu (u rasponu od 5 do 10)
//●	Ime i prezime profesora koji predaje predmet
//●	konstuktore koje mislite da ce vam trebati
//●	gettere i settere za sve atribute
//●	metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//●	metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)

public class Zadatak1 {
    public static void main(String[] args) {
        Student student1 = new Student("Milos Milosevic", 2867, "Osnovne akademske studije");
        Ispit ispit1 = new Ispit("Matematika", 8,"Milena Kosic");
        Ispit ispit2 = new Ispit("Manuelno testiranje", 9, "Biljana Djordjevic");
        Ispit ispit3 = new Ispit("Automatsko testiranje", 5, "Vladimir Jovanovic");
        Ispit ispit4 = new Ispit("SQL", 10, "Milan Minic");


        student1.dodavanjeIspita(ispit1);
        student1.dodavanjeIspita(ispit2);
        student1.dodavanjeIspita(ispit3);
        student1.dodavanjeIspita(ispit4);

        student1.stampanje();


    }
}
