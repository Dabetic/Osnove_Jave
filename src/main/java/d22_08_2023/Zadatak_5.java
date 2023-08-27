package d22_08_2023;

import java.util.Scanner;

public class Zadatak_5 {


//    Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve dok ne unese znak =. Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
//    Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
//    Primer izvrsenja:
//    Unos: (
//    Unos: 2
//    Unos: *
//    Unos: (
//    Unos: 1
//    Unos: +
//    Unos: 3
//    Unos: )
//    Unos: )
//    Unos: =
//    Zagrade su uparene
//            (Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)
//
//    Primer izvrsenja 2:
//    Unos: (
//    Unos: 2
//    Unos: *
//    Unos: (
//    Unos: 1
//    Unos: +
//    Unos: 3
//    Unos: )
//    Unos: =
//    Zagrade nisu uparene
//            (Objasnjenje: fali poslednja zagrada iz formule)

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String karakter;

        int openCounter = 0;
        int closedCounter = 0;

        while (true) {

            System.out.println("Unesite karakter");
            karakter = s.next();

            if (karakter.equals("(")) {
                openCounter = openCounter + 1;
            }

            if (karakter.equals(")")) {
                closedCounter = closedCounter + 1;
            }

            if (karakter.equals("=")) {
                break;
            }

        }

        if (openCounter == closedCounter) {
            System.out.println(("Zagrade su uparene"));
        } else {
            System.out.println(("Zagrade nisu uparene"));
        }

    }
}

