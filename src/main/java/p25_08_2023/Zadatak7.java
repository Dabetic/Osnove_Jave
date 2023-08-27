package p25_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite prvu stranicu ");
        int prvaStr = s.nextInt();

        System.out.println("Unesite drugu stranicu");
        int drugaStr = s.nextInt();

        System.out.println("Unesite drugu stranicu");
        int hipo = s.nextInt();



    }
    public static void pravougliTrougao (int prvaStr , int drugaStr, int hipo) {

        int a = prvaStr;
        int b = drugaStr;
        int c = hipo;


        if(a*a+b*b==c*c) {
        System.out.println("Trougao je pravougli"); }
        else {
            System.out.println("Trougao nije pravougli");
        }


    }
}
