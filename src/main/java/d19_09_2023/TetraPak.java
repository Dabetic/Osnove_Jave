package d19_09_2023;

public class TetraPak extends Ambalaza{

    private boolean daLiSeReciklira;
    private double osnovnaCena;

    public TetraPak(String barKod, String nazivArtikla, int netoTezina, int brutoTezina, boolean daLiSeReciklira, double osnovnaCena) {
        super(barKod, nazivArtikla, netoTezina, brutoTezina);
        this.daLiSeReciklira = daLiSeReciklira;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isDaLiSeReciklira() {
        return daLiSeReciklira;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setDaLiSeReciklira(boolean daLiSeReciklira) {
        this.daLiSeReciklira = daLiSeReciklira;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if(daLiSeReciklira) {
            return (this.brutoTezina - this.netoTezina) * 1.5 + (osnovnaCena);
        }
        return osnovnaCena;
    }

    @Override
    public void stampanje() {
        System.out.println("Bar kod: " + barKod);
        System.out.println("Naziv artikla: " + nazivArtikla);
        System.out.println("Bruto tezina: " + brutoTezina + " gr");
        System.out.println("Neto tezina: " + netoTezina + " gr");
        if(daLiSeReciklira) {
            System.out.println("Reciklira se");
        } else {
            System.out.println("Ne reciklira se");
        }
        System.out.println("Osnovna cena: " + this.osnovnaCena + " din");
        System.out.println("Prodajna cena: " + this.cenaArtikla() + " din");
    }
}
