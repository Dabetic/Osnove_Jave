package p17_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj a");
        int a = s.nextInt();

        System.out.println("Unesite broj b");
        int b = s.nextInt();

        System.out.println("Unestite broj c ");
        int c = s.nextInt();

        if (a > b && a < c) {
            System.out.println("Broj a je u opsegu b i c "); }

        System.out.println("KRAJ");

    }

}
