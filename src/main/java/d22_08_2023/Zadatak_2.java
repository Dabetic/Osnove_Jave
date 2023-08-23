package d22_08_2023;

import java.util.Scanner;

public class Zadatak_2 {
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

