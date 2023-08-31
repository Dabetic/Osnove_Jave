package p25_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite prvu stranicu ");
        int prvaStr = s.nextInt();

        System.out.println("Unesite drugu stranicu");
        int drugaStr = s.nextInt();

        System.out.println("Unesite hipotenuzu");
        int hipo = s.nextInt();

        boolean rezultat = pravougliTrougao(prvaStr,drugaStr,hipo);

        System.out.println(rezultat);

    }
    public static Boolean pravougliTrougao (int a, int b, int c) {

        boolean provera = true;

        if (a*a+b*b==c*c) {

            provera = true;
        } else {

            provera = false;
        }

        return provera;
    }


}
