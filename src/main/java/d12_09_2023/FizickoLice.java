package d12_09_2023;

public class FizickoLice {

    private String imeIprezime;
    private int brojLicneKarte;
    private String jmbg;
    private boolean prethodnoKupovaoPrekoAgencije;

    public FizickoLice () {

    }

    public FizickoLice (String imeIprezime, int brojLicneKarte, String jmbg, boolean prethodnoKupovaoPrekoAgencije) {
        this.imeIprezime = imeIprezime;
        this.brojLicneKarte = brojLicneKarte;
        this.jmbg = jmbg;
        this.prethodnoKupovaoPrekoAgencije = prethodnoKupovaoPrekoAgencije;
    }

    public String getJmbg () {
        return this.jmbg;
    }
    private void setJmbg (String jmbg) {
        this.jmbg = jmbg;
    }

    public boolean getPrethodnoKupovaoPrekoAgencije () {
        return this.prethodnoKupovaoPrekoAgencije;
    }
    public void setPrethodnoKupovaoPrekoAgencije (boolean prethodnoKupovaoPrekoAgencije) {
        this.prethodnoKupovaoPrekoAgencije = prethodnoKupovaoPrekoAgencije;
    }

    public void stampanje () {
        System.out.println("Puno ime: " + this.imeIprezime + " - Broj licne karte: " + this.brojLicneKarte);
    }
}
