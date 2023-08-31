package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak7_zaVezbanje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer>nizA = new ArrayList<>();
        ArrayList<Integer>nizB = new ArrayList<>();

        System.out.println("Unesite N");
        int n = s.nextInt();


        for (int i = 0; i < n ; i++) {

            System.out.println("Unesite broj");
            int broj = s.nextInt();

            nizA.add(broj);

            nizB.add(broj);

//            //drugi nacin
//            if(i<4) {
//                nizB.add(broj);
//            }
//            else {
//                nizB.add(1);
//            }


            }



         for (int j = 3; j < n ; j++)

    {

        nizB.set(j, 1);

    }
        System.out.println("Niz A: " + nizA);
        System.out.print("Niz B: " + nizB);


    }
}
