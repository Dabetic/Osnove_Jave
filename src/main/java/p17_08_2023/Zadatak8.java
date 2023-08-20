package p17_08_2023;

import java.util.Scanner;

public class Zadatak8  {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite vrednost a ");
            int a = s.nextInt();

        System.out.println("Unesite vrednost b ");
            int b = s.nextInt();

        System.out.println("Unesite vrednost b");
            int c = s.nextInt();


            if ( a*a + b*b == c*c ) {
                System.out.println("trougao nije pravougli "); }
                else {
                    System.out.println("trougao je pravougli");

            }
    }
}
