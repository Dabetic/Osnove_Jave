package d08_09_2023;

////3. (ZA VEZBANJE)Kreirati klasu SmartAirConditioning koja ima:
////●	atribut za marku klime (npr: Samsung, Galanz, Gree, …)
////●	atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
////●	atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
////●	atribut za izabranu temperaturu (minimum je 16, maksimum 35)
////●	atribut za mod (hladi/greje)
////●	metodu za stampu - stampa u formatu
////marka - mod - termperatura
////●	metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
////○	30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
////●	metodu koja racuna koliko klima novca potrosi za mesec dana
////○	Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
////○	Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
////○	Metoda vraca ukupnu cenu za taj mesec
////
////U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.
public class SmartAirConditioning {

    String marka;
    int potrosnjaStrujeDokHladi;
    int potrosnjaStrujeDokGreje;
    int izabranaTemp;
    boolean mod;


    public int mesecnaPotrosnja() {

        int racun = 0;

        if(this.mod) {
            racun = 30 * 15 * potrosnjaStrujeDokGreje;
        } else {
           racun = 30 * 15 * potrosnjaStrujeDokHladi;
        }
        return racun;
    }

    public  int potrosnjaKlimeNovcaZaMesec () {

        int racunNovca = 0;


        if(mesecnaPotrosnja() < 350) {

          racunNovca = mesecnaPotrosnja() * 6;
        } else {
            racunNovca = 350 * 6 + (mesecnaPotrosnja() - 350) * 9;
        }
    return racunNovca;
    }

    public void stampanje() {

        System.out.println("Vas racun za potrosenu elektricnu " +
                "energiju za protekli mesec iznosi: " + potrosnjaKlimeNovcaZaMesec() + " din");

    }

}
