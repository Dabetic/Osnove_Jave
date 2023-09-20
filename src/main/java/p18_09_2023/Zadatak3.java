package p18_09_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
        Pravougaonik p1 = new Pravougaonik(10,20);
        Pravougaonik p2 = new Pravougaonik(20,30);
        Pravougaonik p3 = new Pravougaonik(30,40);

        JednostranicniTrougao t1 = new JednostranicniTrougao(5);
        JednostranicniTrougao t2 = new JednostranicniTrougao(8);

        ArrayList<Figura>nizFigura = new ArrayList<>();

        nizFigura.add(p1);
        nizFigura.add(p2);
        nizFigura.add(p3);
        nizFigura.add(t1);
        nizFigura.add(t2);


        for (int i = 0; i < nizFigura.size(); i++) {
            nizFigura.get(i).stampanje();
        }


        int rezPov = 0;
        for (int i = 0; i < nizFigura.size(); i++) {
            rezPov += nizFigura.get(i).povrsina();
        }

        int rezOb = 0;
        for (int i = 0; i < nizFigura.size(); i++) {
            rezOb += nizFigura.get(i).obim();
        }

        System.out.println("**************");
        System.out.println("Rezultat povrsine figura: " + rezPov);
        System.out.println("Rezultat obima figura: " + rezOb);

    }
}
