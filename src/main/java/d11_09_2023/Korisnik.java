package d11_09_2023;

public class Korisnik {

    private String ime;
    private String prezime;

    public Korisnik () {

    }
    public String getIme () {
        return  this.ime = ime;
    }
    public void setIme (String ime) {
        this.ime = ime;
    }
    public String getPrezime () {
        return this.prezime = prezime;
    }
    public void setPrezime (String prezime) {
        this.prezime = prezime;
    }

    public void stampanje () {
        System.out.println("Puno ime korisnika: " + this.ime + " " + this.prezime);
    }
}
