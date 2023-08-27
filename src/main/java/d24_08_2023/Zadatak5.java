package d24_08_2023;

//5.	. Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
//	Primer izvrsenja:
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 3
//Unesite broj: 7
//Unesite broj: 3
//Unesite broj: 9
//Unesite X: 3
//
//Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 1, 3


import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Integer>nizA = new ArrayList<>();

        System.out.println("Unesite N");
        int n = s.nextInt();
        int broj;


        for (int i = 0; i < n; i++) {
            System.out.println("Unesite Broj");
            broj = s.nextInt();

            nizA.add(broj);

        }
            System.out.println("Unesite X");
            int x = s.nextInt();

        System.out.println("Indeksi iz niza jednak broju X");

        for (int i = 0; i <n ; i++) {

            if(nizA.get(i) == x) {
                System.out.print(i + " ");
            }


        }

        }



    }

