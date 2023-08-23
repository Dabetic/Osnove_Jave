package p21_08_2023;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite lozinku ");
        String pass = s.nextLine();

        System.out.println("Skrivena lozinka: ");
        for (int i = 0; i < pass.length() ; i++) {
            System.out.print("*");

        }


    }
}
