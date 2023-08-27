package d22_08_2023;

import java.util.Scanner;

public class Zadatak_2 {

//    Napisati program koji ucitava brojeva od korisnika i za svaki broj prikazuje apsolutnu vrednost sve dok se ne unese nula.
//    Pomoc: Apsolutna vrednost je kada bilo koji broj pretvarate u pozitivan broj. Npr: -2 u 2 ili -4 u 4 dok pozitivni ostaju pozitivni npr: 9 ostaje 9
//    Primer izvrsenja:
//    Unesite broj: 3
//    Apsolutna vrednost je 3
//    Unesite broj: -1
//    Apsolutna vrednost je 1
//    Unesite broj: 0
//    Kraj programa jer je uneta nula.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int broj;
        int apsolutnaVr;

        while (true) {

            System.out.println("Unesite vrednost");
            broj = s.nextInt();
            apsolutnaVr = Math.abs(broj);

            if(broj != 0) {
                System.out.println("Apsolutna vrednost je " + apsolutnaVr);
            }
            else {
                break;
            }

        }

        System.out.println("Kraj programa jer je uneta nula.");
    }
}

