package d22_08_2023;

import java.util.Scanner;

public class Zadatak_3 {

//    Napisati program koji ucitava RIMSKE brojeva od
//    korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
//
//    Primer izvrsenja:
//    Unesite rimski broj: X
//    Arapski: 10
//    Unesite rimski broj: C
//    Arapski: 50
//    Unesite rimski broj: D
//    Arapski: 500
//    Unesite rimski broj: M
//    Arapski: 1000
//    Unesite rimski broj: I
//    Arapski: 1
//    Unesite rimski broj: KRAJ
//    Kraj programa.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String slovo;
        int arapski = 0;

        while (true) {

            System.out.println("Unesite vrednost");
            slovo = s.nextLine();

            if(slovo.equals("KRAJ")) {
                break;
            }
            else {
                if (slovo.equals("I")) {
                    arapski = 1;
                }
                if (slovo.equals("V")) {
                    arapski = 5;
                }
                if (slovo.equals("X")) {
                    arapski = 10;
                }
                if (slovo.equals("L")) {
                    arapski = 50;
                }
                if (slovo.equals("C")) {
                    arapski = 100;
                }
                if (slovo.equals("D")) {
                    arapski = 500;
                }
                if (slovo.equals("M")) {
                    arapski = 1000;
                }

               System.out.println("Arapski " + arapski);
            }

        }
    }
}

