package p11_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Tacka tackaDefoltni = new Tacka();

        tackaDefoltni.setX(10);
        tackaDefoltni.setY(20);

        tackaDefoltni.stampanje();

        System.out.println("*******************");

        Tacka tacka = new Tacka(30, 40);

        tacka.stampanje();


    }
}
