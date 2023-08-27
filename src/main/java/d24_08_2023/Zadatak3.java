package d24_08_2023;

//3. Zadatak
//        Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
//        Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1


import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {

        ArrayList<Integer>niz = new ArrayList<>();

        niz.add(1);
        niz.add(2);
        niz.add(3);
        niz.add(4);
        niz.add(5);
        niz.add(6);
        niz.add(7);
        niz.add(8);
        niz.add(9);
        niz.add(10);


        for (int i = 9; i >= 0; i--) {

            System.out.print(niz.get(i) + " ");

        }



    }
}
