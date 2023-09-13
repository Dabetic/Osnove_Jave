package d11_09_2023;

public class FacebookPost {

    private String opis;
    private Korisnik korisnik;

    public FacebookPost() {

    }
    public FacebookPost (Korisnik korisnik) {
        this.korisnik = korisnik;
    }
    public String getOpis () {
        return this.opis = opis;
    }
    public void setOpis (String opis) {
        this.opis = opis;
    }

    public void stampanje () {
        korisnik.stampanje();
        System.out.println("Opis posta: " + this.opis);
    }


}
