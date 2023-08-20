package p17_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj telefona za proveru: ");
        String brojTelefona = s.nextLine();

        if (!brojTelefona.contains("+381") || brojTelefona.contains("/")) {
            System.out.println("Broj nije validan.");
        }
    }
}
