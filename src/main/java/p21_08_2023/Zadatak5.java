package p21_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N");
        int n = s.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Unesite broj ");
            int broj = s.nextInt();
            sum = sum + broj;
        }

        System.out.println("Suma je " + sum);


        System.out.println();
    }

    }

