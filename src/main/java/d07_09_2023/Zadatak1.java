package d07_09_2023;

//Napišite klasu "Student" koja ima sledeće atribute: ime (String), brojIndeksa (int) i fakultet (String).
// Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti.
// Ispisati informacije o studentima.

public class Zadatak1 {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.punoIme = "Milos Dabetic";
        student1.brojIndeka = 2864;
        student1.nazivFakulteta = "Filozofski fakultet Nis";


        Student student2 = new Student();

        student2.punoIme = "Marko Spasic";
        student2.brojIndeka = 2835;
        student2.nazivFakulteta = "Filozofski fakultet Nis";

        Student student3 = new Student();

        student3.punoIme = "Milovan Nikolic";
        student3.brojIndeka = 4719;
        student3.nazivFakulteta = "Gradjevinski fakultet Nis";

        System.out.println("**********************************");

        System.out.println("Ime studenta: " + student1.punoIme);
        System.out.println("Broj indeksa: " + student1.brojIndeka);
        System.out.println("Naziv fakulteta: " + student1.nazivFakulteta);

        System.out.println("**********************************");

        System.out.println("Ime studenta: " + student2.punoIme);
        System.out.println("Broj indeksa: " + student2.brojIndeka);
        System.out.println("Naziv fakulteta: " + student2.nazivFakulteta);

        System.out.println("**********************************");

        System.out.println("Ime studenta: " + student3.punoIme);
        System.out.println("Broj indeksa: " + student3.brojIndeka);
        System.out.println("Naziv fakulteta: " + student3.nazivFakulteta);



    }
}
