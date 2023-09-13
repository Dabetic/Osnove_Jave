package p12_09_2023;

//Kreirati klasu ZoomCall koja ima:
//link za poziv
//password
//korisnika koji je host
//korisnika koji je guest
//gettere za sve atribute
//setter samo za guest-a
//metodu pokreni poziv koja stampa podatke u formatu:
//
//		Zoom Call: url
//		Password: password
//		Host: ime i prezime
//		Guest: ime i prezime
//		Maksimalno trajanje poziva je (broj minuta)min
//
//		Maksimalno trajanje poziva se cita od korisnika koji je host!
//
//	U glavnom programu kreirati objekte definisanih klasa i testirati rad definisanih funkcija

public class ZoomCall {

    private String linkZaPoziv;
    private String password;

    private Korisnik hostKorisnik;
    private Korisnik guestKorisnik;

    public ZoomCall (String linkZaPoziv, String password,Korisnik hostKorisnik, Korisnik guestKorisnik) {
        this.linkZaPoziv = linkZaPoziv;
        this.password = password;
        this.hostKorisnik = hostKorisnik;
        this.guestKorisnik = guestKorisnik;
    }

    public String getLinkZaPoziv() {
        return this.linkZaPoziv;
    }

//    public void setLinkZaPoziv() {
//        this.linkZaPoziv = linkZaPoziv;
//    }

    public String getPassword() {
        return this.password;
    }

//    public void setPassword (String password) {
//        this.password = password;
//    }

    public Korisnik getHostKorisnik () {
        return this.hostKorisnik;
    }

    public Korisnik getGuestKorisnik () {
        return this.guestKorisnik;
    }

    public void setGuestKorisnik () {
        this.guestKorisnik = guestKorisnik;
    }

    public void stampanje() {
        System.out.println("Zoom url: " + linkZaPoziv);
        System.out.println("Passwoord: " + password);
        System.out.println("Host: " + getHostKorisnik().getImeIprezime());
        System.out.println("Guest: " + getGuestKorisnik().getImeIprezime());
    }

}
