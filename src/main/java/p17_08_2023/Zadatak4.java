package p17_08_2023;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Uneti broj a");
        int a = s.nextInt();

        System.out.println("Uneti broj b");
        int b = s.nextInt();

        if (b < a) {
            System.out.println("broj b je manji od broja a");}

        System.out.println("Kraj");

    }
}
