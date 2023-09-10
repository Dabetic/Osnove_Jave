package d07_09_2023;

//Zadatak 6: (za vezbanje ali topla prepuka svakom): Upravljanje Flotom Vozila -
//Rešite Poslovni Problem
//
//Pretvorite se u softverskog arhitektu koji će rešiti konkretan poslovni problem. Radite za kompaniju za
//dostavu koja se suočava sa sve većim izazovima u upravljanju svojom flotom vozila.
//Vaš zadatak je da razvijete softver za efikasno praćenje i upravljanje resursima kompanije.
//
//Kompanija ima vozila, vozače, rute za dostavu i potrebu da prati status svake dostave.
//Vaš cilj je da identifikujete potrebne klase za rešavanje ovog problema.
//
//**Scenario:**
//
//Kompanija poseduje različite vrste vozila, svako vozilo ima svoje karakteristike,
//uključujući marku, model, registarski broj i godinu proizvodnje.
//Vozači su takođe deo flote i svaki vozač ima svoje lične informacije, uključujući ime, prezime, JMBG,
// broj vozačke dozvole i datum isteka vozačke dozvole.
//
//Dostave se odvijaju duž različitih ruta, a svaka ruta ima svoju polaznu tačku, odredište, dužinu rute (u kilometrima) i očekivano vreme putovanja.
//Vaš zadatak je da definišete potrebne klase za praćenje i upravljanje ovim resursima kako biste pomogli kompaniji da optimizuje svoje poslovanje.
//
//Kroz analizu ovog scenarija, razmislite koje klase su potrebne da biste efikasno rešili problem upravljanja vozilima, vozačima, rutama i dostavama.
//Kreirajte klase sa odgovarajućim atributima kako biste omogućili upravljanje ovim resursima i u glavnom programu kreirajte objekte.

public class Zadatak6Bonus {
    public static void main(String[] args) {

        Vozac vozac1 = new Vozac();

        vozac1.ime = "Dragan";
        vozac1.prezime = "Maksimovic";
        vozac1.jmbg = "7569781";
        vozac1.brojVozDoz = 4781;
        vozac1.rokVazenjaDoz = 2024;


        Vozilo vozilo1 = new Vozilo();

        vozilo1.marka = "Mercedes";
        vozilo1.model = "Kamion";
        vozilo1.regBroj = "NI - 2479";
        vozilo1.godProizvodnje = 2008;

        Rute ruta1 = new Rute();

        ruta1.polaznaTacka = "Prokuplje";
        ruta1.odrediste = "Nis";
        ruta1.duzinaRute = 45;
        ruta1.ocekivanoVremePutovanja = 45;

        Paket paket1 = new Paket();

        paket1.brojPaketa = 2471;
        paket1.kurir = vozac1;
        paket1.kamion = vozilo1;
        paket1.ruta = ruta1;

        System.out.println(paket1.kurir.ime);

        System.out.println("Ime kurira: " + paket1.kurir.ime);
        System.out.println("Prezime kurira: " + paket1.kurir.prezime);
        System.out.println("JMBG kurira: " + paket1.kurir.jmbg);

        System.out.println("Marka vozila: " + paket1.kamion.marka);
        System.out.println("Registarski broj vozila: " + paket1.kamion.regBroj);

        System.out.println("Polazna tacka rute; " + paket1.ruta.polaznaTacka);
        System.out.println("Odrediste rute; " + paket1.ruta.odrediste);
        System.out.println("Duzina rute; " + paket1.ruta.duzinaRute + " km");
        System.out.println("Ocekivano vreme putovanja; " + paket1.ruta.ocekivanoVremePutovanja + " min");

    }
}
