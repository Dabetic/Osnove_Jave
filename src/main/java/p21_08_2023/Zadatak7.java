package p21_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Unesite N");
        int n = s.nextInt();
        int brojac = 0;

        for (int i = 1; i <=n; i++) {
            if (i % 2 == 0) {
                System.out.println("Uneto je " + i);

            }

        }

    }
}
