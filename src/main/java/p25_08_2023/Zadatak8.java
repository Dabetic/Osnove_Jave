package p25_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite rimski broj od I do V");
        String rimskiBroj = s.next();

        int konverzija = konverter(rimskiBroj);

        System.out.println("Arapski broj je: " + konverzija);


    }

    public static int konverter(String rimskiBroj) {

        int arapskiBroj = 0;

        if (rimskiBroj.equals("I")) {
            arapskiBroj = 1;

        }
        if (rimskiBroj.equals("II")) {
            arapskiBroj = 2;

        }

        if (rimskiBroj.equals("III")) {
            arapskiBroj = 3;
        }

        if (rimskiBroj.equals("IV")) {
            arapskiBroj = 4;
        }

        if (rimskiBroj.equals("V")) {
            arapskiBroj = 5;
        }

        return arapskiBroj;
    }


}
