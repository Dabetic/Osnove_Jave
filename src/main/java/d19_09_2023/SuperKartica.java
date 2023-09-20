package d19_09_2023;

public class SuperKartica {
    private int brojKartice;
    private String imeIprezimeVlasnika;
    private double popust;

    public SuperKartica(int brojKartice, String imeIprezimeVlasnika, double popust) {
        this.brojKartice = brojKartice;
        this.imeIprezimeVlasnika = imeIprezimeVlasnika;
        this.popust = popust;
    }

    public int getBrojKartice() {
        return brojKartice;
    }

    public String getImeIprezimeVlasnika() {
        return imeIprezimeVlasnika;
    }

    public double getPopust() {
        return popust;
    }

    public void setBrojKartice(int brojKartice) {
        this.brojKartice = brojKartice;
    }

    public void setImeIprezimeVlasnika(String imeIprezimeVlasnika) {
        this.imeIprezimeVlasnika = imeIprezimeVlasnika;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public void stampanjeKartice () {
        System.out.println("Ime i prezime vlasnika kartice: " + this.imeIprezimeVlasnika);
        System.out.println("Broj kartice: " + brojKartice);
    }
}
