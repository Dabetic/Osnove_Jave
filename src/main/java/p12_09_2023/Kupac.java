package p12_09_2023;

//Kreirati klasu Kupac koja ima:
//ime i prezime
//clansku kartu
//gettere i settere, clanska karta ne moze da se menja
//konstruktore
//metodu stampaj koja stampa u formatu
//ime i prezime - broj kartice
public class Kupac {

    private String imeIprezime;
    private ClanskaKarta clanskaKarta;

    public Kupac () {

    }

    public Kupac (String imeIprezime, ClanskaKarta clanskaKarta) {
        this.clanskaKarta = clanskaKarta;
        this.imeIprezime =  imeIprezime;
    }

    public String getImeIprezime (String imeIprezime) {
       return this.imeIprezime = imeIprezime;
    }

    public void setImeIprezime () {
        this.imeIprezime = imeIprezime;
    }

    public ClanskaKarta getClanskaKarta () {
        return this.clanskaKarta = clanskaKarta;
    }

    public void setClanskaKarta (ClanskaKarta clanskaKarta) {
        this.clanskaKarta = clanskaKarta;
    }


    public void stampanje () {

        System.out.println("Puno ime kupca: " + imeIprezime);
//        System.out.println("Broj kartice: " + clanskaKarta.getBrojKartice());

    }

}
