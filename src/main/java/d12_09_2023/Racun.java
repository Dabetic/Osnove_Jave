package d12_09_2023;

//●	broj racuna (npr: 170-289328923-23)
//●	ime i prezime osobe
//●	trenutno stanje na racunu (npr: 100, 1220)
//●	gettere i setter za sve atribute, sem settera za stanje na racunu
//●	metodu uplatiNaRacun kojoj se dodaje prosledjena vrednost na stanje
//●	metodu skiniSaRacunai kojom se stanje umanjuje za prosledjenja vrednost
//●	metodu koja stampa podatke o racunu u formatu:
//Ime i prezime  -  broj racuna
//stanje na racunu je (trenutno stanje) rsd.
public class Racun {

    private int brojRacuna;
    private String imeIPrezimeOsobe;
    private double trenutnoStanjeNaRacunu;

    public Racun (int brojRacuna, String imeIPrezimeOsobe, double trenutnoStanjeNaRacunu) {
        this.brojRacuna = brojRacuna;
        this.imeIPrezimeOsobe =imeIPrezimeOsobe;
        this.trenutnoStanjeNaRacunu = trenutnoStanjeNaRacunu;
    }
    public double getTrenutnoStanjeNaRacunu () {
        return this.trenutnoStanjeNaRacunu;
    }

    public void uplatiNaRacun (double uplatiIznos) {
        this.trenutnoStanjeNaRacunu += uplatiIznos;
    }

    public void skiniSaRacuna (double skiniSaRacuna) {
        this.trenutnoStanjeNaRacunu -= skiniSaRacuna;
    }
    public void stampanje () {
        System.out.println("Korisnik: " + this.imeIPrezimeOsobe + " - " + brojRacuna);
        System.out.println("Trenutno stanje na racunu iznosi: " + this.trenutnoStanjeNaRacunu);
    }

}
