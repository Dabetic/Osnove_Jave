package p12_09_2023;

//Kreirati klasu Korisnik koja ima:
//ime i prezime
//tip licence (basic/pro/premium)
//konstruktore. Po difoltu korisnik ima basic licencu.
//gettere i settere za sve atribute, sem za tip licence koja ne moze da se menja
//metodu pretplati se koja postavlja licencu u zavisnosi od uplacene sume:
//ako je uplata 100, postavlja licencu na “pro”
//ako je uplata 150, postavlja licencu na “premium”
//Metoda kao parametar prima vrednost uplate $100 ili $150
//metodu ponisti pretplatu koja postavlja licencu na basic
//metodu koja vraca maksimalnu duzinu trajanja video poziva u zavisnosti od licence
//ako je basic, vraca 40min
//ako je pro, vraca 240min
//ako je  premium, vraca 1440min
//metodu za stampu koja stampa u formatu:
//ime i prezime
public class Korisnik {

    private String imeIprezime;
    private String tipLicence;

    public Korisnik (String imeIprezime) {
        this.imeIprezime = imeIprezime;
        this.tipLicence = "Basic";
    }

    public String getImeIprezime () {
        return this.imeIprezime = imeIprezime;
    }

    public void setImeIprezime (String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }


  public String pretplataZaLicencu (int iznosUplate) {

        this.tipLicence = "Basic";

        if(iznosUplate == 100) {
            this.tipLicence = "Pro";
        }
        if(iznosUplate == 150) {
            this.tipLicence = "Premium";
        }
        return  this.tipLicence;
  }
    public void ponistavanjeLicence () {

        this.tipLicence = "Basic";
    }

    public int proveraMaksimalneDuzTrajanjaPoziva (String tipLicence) {

        int duzinaPoziva = 0;

        if(tipLicence.equals("Basic")) {

            duzinaPoziva = 40;
        }
        if(tipLicence.equals("Pro")) {
            duzinaPoziva = 240;
        }
        if(tipLicence.equals("Premium")) {
            duzinaPoziva = 1440;
        }

        return duzinaPoziva;
    }

    public void stampanje () {
        System.out.println("Puno ime korisnika: " + imeIprezime);
    }


}
