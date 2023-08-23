package p22_08_2023;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ocekivane rezultate");
        String expectedPrvi = s.nextLine();

        System.out.println("Unesite stvarne rezultate");
        String actualPrvi = s.nextLine();

        if (expectedPrvi!=actualPrvi) {

        while (expectedPrvi!=actualPrvi) {
            System.out.println("Greska unesite ponovo ocekivane rezultate ");
            expectedPrvi = s.nextLine();

            System.out.println("Unesite ponovo stvarne rezultate");
            actualPrvi = s.nextLine(); }

        }
    }
}
