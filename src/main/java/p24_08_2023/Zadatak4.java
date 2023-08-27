package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer>brojevi = new ArrayList<>();


        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);

        System.out.println("Unesite K od 0 do 4 ");
        int k = s.nextInt();


        System.out.println(brojevi.get(k));



    }
}
