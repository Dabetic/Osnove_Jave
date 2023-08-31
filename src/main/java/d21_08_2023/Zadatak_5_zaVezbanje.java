package d21_08_2023;

import java.util.Random;
import java.util.Scanner;

public class Zadatak_5_zaVezbanje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();


        for (int i = 0; i < 5; i++) {

            int x = random.nextInt(49);
            int y = random.nextInt(49);

            System.out.println("Koliko je " + x + " + " + y);
            int rez = s.nextInt();

            if (x + y == rez) {
                System.out.println("Cestitam!");
            } else {
                System.out.println("Greska!");
            }


        }
    }
}
