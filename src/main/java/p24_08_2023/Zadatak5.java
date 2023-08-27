package p24_08_2023;

import java.util.ArrayList;

public class Zadatak5 {public static void main(String[] args) {

    ArrayList<Integer> brojevi = new ArrayList<>();


    brojevi.add(10);
    brojevi.add(20);
    brojevi.add(30);
    brojevi.add(40);
    brojevi.add(50);


    int suma = 0;

    for (int i = 0; i < brojevi.size(); i++) {

        suma = suma + brojevi.get(i);

    }

    System.out.println(suma);

}


}

