package p18_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj m");
        int m = s.nextInt();

        System.out.println("Unesite broj n");
        int n = s.nextInt();

        for (int i= m; i < n; i++ ) {
            System.out.print(i + ", ");
        }
        System.out.println("Kraj");
    }
}
