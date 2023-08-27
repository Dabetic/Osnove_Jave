package d24_08_2023;

//2. Zadatak
//        Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 4
//        Unesite broj: 7
//        Unesite broj: 8
//        U nizu ima 2 parna broja.



import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer>nizBrojeva = new ArrayList<>();

        System.out.println("Unesite N");
        int n = s.nextInt();

        int broj = 0;
        int brojac = 0;

        for (int i = 0; i <n ; i++) {
            System.out.println("Unesite broj");
            broj = s.nextInt();

            nizBrojeva.add(broj);

            if (broj % 2 == 0) {
                brojac = brojac + 1;
            }
        }

        System.out.println("Broj parnih brojeva u nizu je " + brojac);
    }
}
