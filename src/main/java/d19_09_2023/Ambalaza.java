package d19_09_2023;

public abstract class  Ambalaza {

    protected String barKod;
    protected String nazivArtikla;
    protected int netoTezina;
    protected int brutoTezina;

    public Ambalaza(String barKod, String nazivArtikla, int netoTezina, int brutoTezina) {
        this.barKod = barKod;
        this.nazivArtikla = nazivArtikla;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }

    public String getBarKod() {
        return barKod;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public int getNetoTezina() {
        return netoTezina;
    }

    public int getBrutoTezina() {
        return brutoTezina;
    }

    public void setBarKod(String barKod) {
        this.barKod = barKod;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public void setNetoTezina(int netoTezina) {
        this.netoTezina = netoTezina;
    }

    public void setBrutoTezina(int brutoTezina) {
        this.brutoTezina = brutoTezina;
    }

    public int razlikaBrutoNeto () {
        return brutoTezina - netoTezina;
    }

    public abstract double cenaArtikla ();

    public abstract void stampanje ();


}
