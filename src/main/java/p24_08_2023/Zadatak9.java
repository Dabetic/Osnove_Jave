package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> niz = new ArrayList<>();

        int n;

        System.out.println("Unesite N");
        n = s.nextInt();
        int broj = 0;

        for (int i = 0; i < n ; i++) {

            System.out.println("Unesite broj");
            broj = s.nextInt();

        }

                niz.add(broj);

        System.out.println(niz);



    }
}
