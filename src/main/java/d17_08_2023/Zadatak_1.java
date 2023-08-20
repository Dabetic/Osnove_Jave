package d17_08_2023;

import java.util.Scanner;


//1.	Napisati program koji ima informacije koje ucitava informacije sa tastature:
//●	Ime
//●	Prezime
//●	godinu rodjenja
//        I stampa informaicije u formatu:
//[ime] [prezime] - [startost] god
//Primer izvrsenja:
//        Ako je ime = Milan, prezime = Jovanovic i godina rodjenja 1995 stapaju se informacije
//        Milan Jovanovic - 26 god


public class Zadatak_1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite vase ime ");
            String ime = s.nextLine();

        System.out.println("Unestie vase prezime ");
            String prezime = s.nextLine();

        System.out.println("Unesite vasu godinu rodjenja ");
            int godineRodjenja = s.nextInt();

        System.out.print(ime + " " + prezime + " - " + (2023 - godineRodjenja) + " godina");

    }
}
