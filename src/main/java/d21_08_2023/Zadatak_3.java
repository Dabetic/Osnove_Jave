package d21_08_2023;

import java.util.Scanner;

public class Zadatak_3 {

//    Napisati program koji simulira ponasanje speak loud programa. Korisnik unosi N reci a program ispisuje svaku rec na ekranu tako da zadovolji uslov:
//    ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
//    ako se ne sadrzi, program dostampa na kraju
//    Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima). Svaka uneta rec sa ! utice na agresivnost.
//    Primer izvrsenja:
//    Unesite N: 5
//    Unesite tekst: Cao!
//    Cao!
//    Unesite tekst: Hello
//    Hello!
//    Unesite tekst: Hi!
//    Hi!
//    Unesite tekst: Cuti
//    Cuti!
//    Unesite tekst: Ajde!
//    Ajde!
//    Nivo agresivnosti 60.
//            (Objasnjenje, 60% jer je od 5 unetih reci, 3 bilo sa !)

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N");
        int n = s.nextInt();

        int sumaBez = 0;
        int sumaUz= 0;

        for (int i = 0; i < n; i++) {

            System.out.println("Unesite rec");
            String rec = s.next();

            if (!rec.contains("!")) {
                System.out.println(rec + "!");
                sumaBez = sumaBez + 1;

            } else {
                System.out.println(rec);
                sumaUz = sumaUz  + 1;
            }

        }
        System.out.println("Nivo agresivnosti je " + sumaUz * 100 / n + "%");


    }

}
