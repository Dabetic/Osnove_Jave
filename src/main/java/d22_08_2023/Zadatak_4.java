package d22_08_2023;

import java.util.Scanner;

public class Zadatak_4 {
//
//    Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
//    Primer izvrsenja 1:
//    Unesite broj:1
//    Unesite broj:2
//    Unesite broj:0
//    Unesite broj:2
//    Kraj programa.
//            (Objasnjenje: Kraj jer je uneto dve dvojke)
//
//    Primer izvrsenja 1:
//    Unesite broj:1
//    Unesite broj:2
//    Unesite broj:1
//    Unesite broj:3
//    Unesite broj:1
//    Kraj programa.
//            (Objasnjenje: Kraj jer je uneto tri jedinice)


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int broj;

        int oneCounter = 0;
        int twoCounter = 0;

        while (true) {

            System.out.println("Unesite broj");
            broj = s.nextInt();

            if(broj == 2) {
                twoCounter = twoCounter + 1;
            }

            if(broj == 1) {
                oneCounter = oneCounter + 1;
            }

            if(oneCounter == 3 || twoCounter == 2) {
                break;
            }

        }

        System.out.println("Kraj");
    }
}

