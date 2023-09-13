package p11_09_2023;

public class Film {

    private String nazivFilma;
    private int godinaIzdanja;
    private Reziser reziser;

    public Film () {

    }


    public Film (String nazivFilma, int godinaIzdanja,Reziser reziser) {

        this.reziser = reziser;
        this.nazivFilma = nazivFilma;
        this.godinaIzdanja = godinaIzdanja;

    }

    public String getNazivFilma () {
        return this.getNazivFilma();
    }

    public void setNazivFilma(String nazivFilma) {
        this.nazivFilma = nazivFilma;
    }

    public int getGodinaIzdanja() {
        return  this.godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public void setReziser (Reziser reziser) {
        this.reziser = reziser;
    }

    public Reziser getReziser() {
        return reziser;
    }


    public void stampanje () {

        System.out.print("Naziv filma: " + this.nazivFilma + " - " + "Godina izdanja: " + this.godinaIzdanja + " Novi reziser ");
        reziser.stampanjeRez();

    }


}
