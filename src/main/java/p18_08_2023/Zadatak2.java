package p18_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj");
        int broj = s.nextInt();


        if (broj < 10 ) {
            System.out.println("Stampamo jednocifren broj "); }
            else if (broj < 99) {
                System.out.println("Stampamo dvocifren broj ");
    }
            else if (broj >= 100) {
            System.out.println("Stampamo trocifren broj"); }


        System.out.println("Kraj");
}}
