package d21_08_2023;

import java.util.Scanner;

public class Zadatak_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N");
        int n = s.nextInt();

        int likeCounter = 0;
        int smileCounter = 0;
        int heartCounter = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("Reaguj");
            String rec = s.next();

            if(rec.equals("smile")) {
                smileCounter = smileCounter + 1;
            }

            if(rec.equals("like")) {
                likeCounter = likeCounter + 1;
            }

            if(rec.equals("heart")) {
                heartCounter = heartCounter + 1;
            }

        }

        System.out.println("Summary: like " + likeCounter + " | " + "smile " + smileCounter + " | " + "heart " + heartCounter );

    }
}

