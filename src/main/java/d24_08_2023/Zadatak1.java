package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

////
////1.Zadatak
////        Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
////        Primer:
////        Unesite pozicjiu od 0 do 9: 3
////        Unesite novu vrednost: 11
////        Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.

public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList<Integer> nizRBrojeva= new ArrayList<>();

        Scanner s = new Scanner(System.in);

        nizRBrojeva.add(0);
        nizRBrojeva.add(1);
        nizRBrojeva.add(2);
        nizRBrojeva.add(3);
        nizRBrojeva.add(4);
        nizRBrojeva.add(5);
        nizRBrojeva.add(6);
        nizRBrojeva.add(7);
        nizRBrojeva.add(8);
        nizRBrojeva.add(9);


        System.out.println("Unesite poziciju od 0 do 9");
        int n = s.nextInt();

        System.out.println("Unesite novu vrednost");
        int k = s.nextInt();

        nizRBrojeva.set(n, k);

        System.out.println("Nova vrednost na poziciji " + n + " je " + nizRBrojeva.get(n));
        System.out.println(nizRBrojeva);


    }
}
