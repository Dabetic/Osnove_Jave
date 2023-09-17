package d15_09_2023;

//Kreirati klasu Osoba koja ima:
//-	ime i prezime
//-	jmbg
//-	godinu rodjenja
//-	default-ni konstuktor
//-	konstuktor sa parametrima
//-	gettere i settere
//-	metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
public class Osoba {

    protected String ime;
    protected String prezime;
    protected String jmbg;
    protected int godinaRodjenja;

    public Osoba() {

    }

    public Osoba(String ime,String prezime, String jmbg, int godinaRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getImeIPrezime() {
        return ime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setIme(String imeIPrezime) {
        this.ime = ime;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public void stampanje () {
        System.out.println("Ime i prezime: " + ime + " " + prezime + " - JMBG:" + jmbg + " - Godina rodjenja: " + godinaRodjenja);
    }

}
