package d19_09_2023;

public class StaklenaAmbalaza extends Ambalaza{

    private double kaucijaZaFlase;
    private boolean daLiSePlacaKaucija;
    private double osnovnaCenaStakleneAmb;

    public StaklenaAmbalaza(String barKod, String nazivArtikla, int netoTezina, int brutoTezina, double kaucijaZaFlase, boolean daLiSePlacaKaucija, double osnovnaCenaStakleneAmb) {
        super(barKod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucijaZaFlase = kaucijaZaFlase;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCenaStakleneAmb = osnovnaCenaStakleneAmb;
    }

    public double getKaucijaZaFlase() {
        return kaucijaZaFlase;
    }

    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }

    public double getOsnovnaCenaStakleneAmb() {
        return osnovnaCenaStakleneAmb;
    }

    public void setKaucijaZaFlase(double kaucijaZaFlase) {
        this.kaucijaZaFlase = kaucijaZaFlase;
    }

    public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
    }

    public void setOsnovnaCenaStakleneAmb(double osnovnaCenaStakleneAmb) {
        this.osnovnaCenaStakleneAmb = osnovnaCenaStakleneAmb;
    }

    @Override
    public double cenaArtikla() {
        if(daLiSePlacaKaucija) {
           return osnovnaCenaStakleneAmb * 1.2 + kaucijaZaFlase;
        } else {
            return osnovnaCenaStakleneAmb * 1.2;
        }
    }

    @Override
    public void stampanje() {
        System.out.println("Bar kod: " + barKod);
        System.out.println("Naziv artikla: " + nazivArtikla);
        System.out.println("Bruto tezina: " + brutoTezina + " gr");
        System.out.println("Neto tezina: " + netoTezina + " gr");
        System.out.println("Osnovna cena: " + this.osnovnaCenaStakleneAmb + " din");


        if(daLiSePlacaKaucija) {
            System.out.println("Kaucija se placa " + kaucijaZaFlase + " din");
        } else {
            System.out.println("Kaucija se ne placa");
        }

        System.out.println("Prodajna cena: " + this.cenaArtikla() + " din");

    }
}
