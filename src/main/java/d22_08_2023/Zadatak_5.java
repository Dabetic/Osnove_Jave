package d22_08_2023;

import java.util.Scanner;

public class Zadatak_5 {
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

