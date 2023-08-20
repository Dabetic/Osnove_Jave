package p17_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesi broj a: ");
        double a = s.nextDouble();

        System.out.print("Unesi broj b: ");
        double b = s.nextDouble();
        System.out.print("Unesi broj c: ");
        double c = s.nextDouble();

        double srednjaVrednost = (a + b + c) / 3;

        System.out.printf("Srednja vrednost je: " + srednjaVrednost);
    }
}
