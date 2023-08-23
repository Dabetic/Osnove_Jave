package d22_08_2023;

import java.util.Scanner;

public class Zadatak_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int broj;
        int suma = 0;

        while ( suma<= 100) {

            System.out.println("Unesite vrednost");
            broj = s.nextInt();

            suma = suma + broj;

        }

        System.out.println("Prekoracenje! Kraj programa. Sracunata suma je " + suma);
    }
}

