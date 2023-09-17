package d14_09_2023;

////Napisati klasu Ispit koja ima
////●	naziv predmeta
////●	ocenu (u rasponu od 5 do 10)
////●	Ime i prezime profesora koji predaje predmet
////●	konstuktore koje mislite da ce vam trebati
////●	gettere i settere za sve atribute
////●	metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
////●	metodu koja stampa ispit u formatu:
////(naziv predmeta) - (profesor) - (ocena)
public class Ispit {

    private String nazivPredmeta;
    private int ocena;
    private String imeProfesora;

    public Ispit(String nazivPredmeta, int ocena, String imeProfesora) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.imeProfesora = imeProfesora;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public String getImeProfesora() {
        return imeProfesora;
    }

    public boolean daLiJeIspitPolozen () {
        if(this.ocena > 5 && this.ocena <= 10) {
            return true;
        }
        return false;
    }

    public void stampanjeIspita() {
        System.out.println("Naziv predmeta: " + this.nazivPredmeta + " Profesor: " + imeProfesora + " - Ocena: " + ocena);
    }


}
