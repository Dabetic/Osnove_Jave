package p18_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj N: ");
        int n = s.nextInt();

        if (n % 2 == 0){
            System.out.println("Broj je deljiv sa 2");
        }else if (n % 2 == 1){
            System.out.println("Broj je deljiv sa 3");
    }
} }
