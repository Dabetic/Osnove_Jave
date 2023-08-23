package p22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj " );
        int broj = s.nextInt();


        while (broj < 10 || broj > 50) {
            System.out.println("Greska probajte ponovo ");
            broj = s.nextInt(); }

                System.out.println("Kraj");

    }

}