package p15_09_2023;


public class Osoba {
    protected String imeIprezime;
    protected String jmbg;

    public Osoba() {

    }

    public Osoba(String imeIprezime, String jmbg) {
        this.imeIprezime = imeIprezime;
        this.jmbg = jmbg;
    }

    public void stampanje () {
        System.out.println("Ime i prezime: " + imeIprezime + " JMBG: " + jmbg);
    }
}
