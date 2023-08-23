package p22_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int brojac = 0;

        while (brojac < 2) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();

            if (broj == 0) {
                brojac = brojac + 1;
            }
        }
        System.out.println("KRAJ!");
    }
}
