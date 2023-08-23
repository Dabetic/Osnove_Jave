package d22_08_2023;

import java.util.Scanner;

public class Zadatak_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int broj;

        int oneCounter = 0;
        int twoCounter = 0;

        while (true) {

            System.out.println("Unesite broj");
            broj = s.nextInt();

            if(broj == 2) {
                twoCounter = twoCounter + 1;
            }

            if(broj == 1) {
                oneCounter = oneCounter + 1;
            }

            if(oneCounter == 3 || twoCounter == 2) {
                break;
            }

        }

        System.out.println("Kraj");
    }
}

