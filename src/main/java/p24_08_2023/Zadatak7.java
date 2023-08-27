package p24_08_2023;

import java.util.ArrayList;

public class Zadatak7 {
    public static void main(String[] args) {
        ArrayList<String> meni = new ArrayList<>();

        meni.add("Aglio E Olio......");
        meni.add("Primavera.....");
        meni.add("Arrabiatta.....");
        meni.add("Napolitana.....");
        meni.add("Polo E Spinaci.....");


        ArrayList<String> cene = new ArrayList<>();

        cene.add("500 rsd");
        cene.add("340 rsd");
        cene.add("420 rsd");
        cene.add("440 rsd");
        cene.add("550 rsd");



        for (int i = 0; i < meni.size(); i++) {

            System.out.println(meni.get(i) + cene.get(i));


        }








    }
}
