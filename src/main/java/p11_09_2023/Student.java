package p11_09_2023;

//ime
//prezime
//broj indeksa (int)
//da li je na budzetu
public class Student {

    private String ime;
    private String prezime;
    private int brojIndeksa;
    private boolean daLiJeNaBudzetu;

    public String getIme () {
        return this.ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime () {
        return this.prezime;
    }

    public void setPrezime (String prezime) {
        this.prezime = prezime;
    }

    public int getBrojIndeksa () {
        return this.brojIndeksa;
    }

    public void setBrojIndeksa (int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public boolean getDaLiJeNaBudzetu () {
        return this.daLiJeNaBudzetu;
    }

    public void setDaLiJeNaBudzetu (boolean daLiJeNaBudzetu) {
        this.daLiJeNaBudzetu = daLiJeNaBudzetu;
    }

    public  void stampanje () {

        System.out.println("Ime: " + this.ime);
        System.out.println("Prezime: " + this.prezime);
        System.out.println("Broj indeksa: " + this.brojIndeksa);
        System.out.println("Da li je na budzetu: " + this.daLiJeNaBudzetu);

    }


}
