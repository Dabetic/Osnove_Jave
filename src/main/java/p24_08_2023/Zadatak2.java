package p24_08_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<Integer>brojevi = new ArrayList<>();


        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);

    int tri = brojevi.get(3);
        tri = tri * 10;

        brojevi.set(3, tri);
        System.out.println(brojevi.get(3));
    }
}
