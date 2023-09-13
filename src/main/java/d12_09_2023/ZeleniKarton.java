package d12_09_2023;

//●	ime i prezime studenta
//●	broj indeksa
//●	naziv predmeta
//●	ime i prezime profesora
//●	ocenu - od 5 do 10
//●	gettere i settere
//●	konstruktore
//●	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//●	metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime

public class ZeleniKarton {

    private String imeIPrezimeStudenta;
    private int brojIndexa;
    private String nazivPredmeta;
    private String imeIprezimeProfesora;
    private int ocena;

    public ZeleniKarton (String imeIPrezimeStudenta, int brojIndexa, String nazivPredmeta, String imeIprezimeProfesora, int ocena) {
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
        this.brojIndexa = brojIndexa;
        this.nazivPredmeta = nazivPredmeta;
        this.imeIprezimeProfesora = imeIprezimeProfesora;
        this.ocena = ocena;
    }

    public void stampanje () {
        System.out.print("Naziv predmeta: " + nazivPredmeta + " - " + "Ocena: " + ocena);
        System.out.println();
        System.out.print("Student: " + imeIPrezimeStudenta + " - " + "Broj indeksa" + brojIndexa);
        System.out.println();
        System.out.println("Profesor: " + imeIprezimeProfesora);
    }

    public int getOcena() {
        return this.ocena;
    }

}
