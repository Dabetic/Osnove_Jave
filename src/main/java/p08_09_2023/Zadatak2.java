package p08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Auto noviAuto = new Auto();

        noviAuto.imeVozacaIPrezime = "Milos Dabetic";
        noviAuto.brojVrata = 4;
        noviAuto.trenutnaBrzina = 50;
        noviAuto.markaAutomobila = "BMW";
        noviAuto.potrosnjaNaStoKM = 100;
        noviAuto.godinaProizvodnje = 1960;
        noviAuto.godinaVaznjeRegistracije = 2023;


        noviAuto.stampanje();

//        noviAuto.azuriranjeAuta("Dragan Dimitrijevic", "Audi", 5,80,100);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");

        if(noviAuto.daLijeAutoOldtimer(noviAuto.godinaProizvodnje)) {
            System.out.println("Auto je oldtimer");
        } else {
            System.out.println("Auto nije oldtimer");
        }

        if(noviAuto.daLiJeIsteklaRegistracija(2022)) {
            System.out.println("Registracija nije istekla");
        } else {
            System.out.println("Registracija je istekla");
        }

        System.out.println("Cena registracije je; " + noviAuto.cenaRegistracijeAuta(2001) + " RSD");

    }
}
