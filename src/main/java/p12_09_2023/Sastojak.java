package p12_09_2023;

//Kreirati klasu Sastojak koja ima:
//naziv sastojka
//cenu
//gettere i settere
//konstuktore

public class Sastojak {

    private String nazivSas;
    private int cena;

    public Sastojak (String nazivSas, int cena) {
        this.nazivSas = nazivSas;
        this.cena = cena;
    }

    public String getNazivSas () {
        return this.nazivSas = nazivSas;
    }

    public void setNazivSas (String nazivSas) {
        this.nazivSas = nazivSas;
    }

    public int getCena () {
        return this.cena = cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
