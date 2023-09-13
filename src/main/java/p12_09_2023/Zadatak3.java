package p12_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Sastojak sastojak1 = new Sastojak("Cimet", 15);
        Sastojak sastojak2 = new Sastojak("Vanilin secer", 12);
        Sastojak sastojak3 = new Sastojak("Prasak za pecivo", 20);


        ArrayList <Sastojak>nizSastojaka = new ArrayList<>();

        System.out.println("Unesite broj sastojaka");
        int n = s.nextInt();

        for (int i = 0; i <=n; i++) {


//            System.out.println("Unesite naziv sastojka");
//            String nazivSastojka = s.next();
//
//            System.out.println("Unesite cenu sastojaka");
//            int cenaSas = s.nextInt();

            nizSastojaka.add(sastojak1);
            nizSastojaka.add(sastojak2);
            nizSastojaka.add(sastojak3);


        }

        System.out.println(nizSastojaka);


    }
}
