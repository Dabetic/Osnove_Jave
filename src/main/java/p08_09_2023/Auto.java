package p08_09_2023;

public class Auto {

    String imeVozacaIPrezime;
    String markaAutomobila;
    int potrosnjaNaStoKM;
    int brojVrata;
    int trenutnaBrzina;

    int godinaProizvodnje;
    int godinaVaznjeRegistracije;
    String kubukazaAuta;


    public void stampanje() {
        System.out.println("Ime vozaca; " + imeVozacaIPrezime);
        System.out.println("Marka automobila; " + markaAutomobila);
        System.out.println("Potrosnja na 100km; " + potrosnjaNaStoKM);
        System.out.println("Broj Vrata; " + brojVrata);
        System.out.println("Trenutna brzina; " + trenutnaBrzina);

    }

    public void azuriranjeAuta(String unesiVozaca, String unesiMarku, int brVrata, int novPortrosnja, int trenutnaBrzina) {

        this.potrosnjaNaStoKM = novPortrosnja;
        this.trenutnaBrzina = trenutnaBrzina;
        this.brojVrata = brVrata;
        this.markaAutomobila = unesiMarku;
        this.imeVozacaIPrezime = unesiVozaca;

    }

    public Boolean proveraPrekoracenjaBrzine(int limit) {

        boolean jelPrekoracanje = false;

        if (trenutnaBrzina > limit) {
            jelPrekoracanje = true;
        }

        return jelPrekoracanje;
    }

    public boolean daLijeAutoOldtimer(int godinaProizvodnje) {

        if (godinaProizvodnje < 1950) {
            return true;
        }

        return false;
    }

    public boolean daLiJeIsteklaRegistracija(int godinaVaznjeRegistracije) {

        if (godinaVaznjeRegistracije >= 2023) {

            return true;

        } else {
            return false;
        }

    }


    public int cenaRegistracijeAuta(int kubikaza) {

        if (kubikaza > 2000 && kubikaza <= 2999) {
//            (uslov moze biti pojednostavljen <=2000)

            return kubikaza * 100;

        }

        if (kubikaza > 3000) {

            return (kubikaza * 30) / 100;

        }
        return 0;
    }
}







