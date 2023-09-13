package d12_09_2023;

public class Ugovor {

    private String datumSklapanjaUgovora;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private double cenaNekretnine;
    private String adresaNekretnine;
    public double iznosProceneZarade;



    public Ugovor(FizickoLice prodavac, FizickoLice kupac, double cenaNekretnine, String adresaNekretnine, String datumSklapanjaUgovora) {
            this.prodavac = prodavac;
            this.kupac = kupac;
            this.cenaNekretnine = cenaNekretnine;
            this.adresaNekretnine = adresaNekretnine;
            this.datumSklapanjaUgovora =datumSklapanjaUgovora;
            this.metodaProcentaZarade();
    }

    public double getIznosProceneZarade() {
        return iznosProceneZarade;
    }

    public void setIznosProceneZarade(double iznosProceneZarade) {
        this.iznosProceneZarade = iznosProceneZarade;
    }

    public void metodaProcentaZarade() {
        if (kupac.getPrethodnoKupovaoPrekoAgencije()) {
            this.iznosProceneZarade = 0.02;
        } else {
            this.iznosProceneZarade = 0.03;
        }
    }

    public double zaradaAgencije() {
//        System.out.println((cenaNekretnine + iznosProceneZarade));
        return (1000 + this.cenaNekretnine * this.iznosProceneZarade);
    }

    public void stampanje() {
        System.out.println("Datum sklapanja ugovora: " + datumSklapanjaUgovora);
        System.out.print("Prodavac - ");
        prodavac.stampanje();

        System.out.print("Kupac - ");
        kupac.stampanje();

        System.out.println("Adresa nekretnine: " + adresaNekretnine);
        System.out.print("Iznos: " + cenaNekretnine + " EUR" + " ");
        System.out.println("pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od: "
                + zaradaAgencije() + " EUR");


    }


}
