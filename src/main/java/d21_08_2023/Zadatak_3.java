package d21_08_2023;

import java.util.Scanner;

public class Zadatak_3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N");
        int n = s.nextInt();

        int sumaBez = 0;
        int sumaUz= 0;

        for (int i = 0; i < n; i++) {

            System.out.println("Unesite rec");
            String rec = s.next();

            if (!rec.contains("!")) {
                System.out.println(rec + "!");
                sumaBez = sumaBez + 1;

            } else {
                System.out.println(rec);
                sumaUz = sumaUz  + 1;
            }

        }
        System.out.println("Nivo agresivnosti je " + sumaUz * 100 / n + "%");


    }

}
