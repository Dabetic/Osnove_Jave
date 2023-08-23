package d21_08_2023;

import org.example.Main;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N");
        int n = s.nextInt();
        int suma = 0;

        for (int i = 1; i <=n ; i++) {

            System.out.println("Unesite broj");
            int broj = s.nextInt();

            if (broj >=100 && broj <1000) {
                suma = suma + broj;
            }
        }

        System.out.println("Suma trocifrenih brojeva je " + suma);

    }
}
