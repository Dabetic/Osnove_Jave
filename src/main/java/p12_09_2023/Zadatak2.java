package p12_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Korisnik korisnik1 = new Korisnik("Milos Dabetic");
        Korisnik korisnik2 = new Korisnik("Mirko Mirkovic");
        ZoomCall poziv1 = new ZoomCall("www.zoom.com", "1234", korisnik1, korisnik2);


        poziv1.stampanje();


    }
}
