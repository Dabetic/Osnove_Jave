package d25_08_2023;

//6.	Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//        Primer izvrsenja:
//        izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//        izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1


public class Zadatak6 {
    public static void main(String[] args) {

        mNMetoda(5,15);

    }

    public static void mNMetoda (int x, int y) {

        int brojac = 0;
        int suma = 0;
        for (int i = x; i <y ; i++) {

            brojac = brojac + 1;

        }

        System.out.println("Izmedju " + x + " i " + y + " ima " + brojac + " brojeva");

    }

}
