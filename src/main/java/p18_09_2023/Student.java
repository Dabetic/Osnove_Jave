package p18_09_2023;

//ime i prezime studenta
//broj indeksa
//godinu studija
//gettere, settere i konstruktore
//apstraktnu metodu koja vraca cenu skolarine.
//apstraktnu metodu koja vraca da li je student na buzetu ili ne.
//metodu koja stampa podatke u formatu:
//ime i prezime, broj indeksa, godina studija

public abstract class Student {

    protected String imeIPrezime;
    protected int brojIndeksa;
    protected int godinaStudija;

    abstract int cenaSkolarine();
    abstract boolean buzdetSmofinansiranje();

    public Student(String imeIPrezime, int brojIndeksa, int godinaStudija) {
        this.imeIPrezime = imeIPrezime;
        this.brojIndeksa = brojIndeksa;
        this.godinaStudija = godinaStudija;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void stampanje () {
        System.out.println("Ime i prezime: " + this.imeIPrezime + " Broj indeksa: " + this.brojIndeksa + " Godina studija: " + this.godinaStudija);

        if(this.buzdetSmofinansiranje()){
            System.out.println("Budzet ");
        } else {
            System.out.println("Samofinansiranje ");
            System.out.println("Cena studija: " + this.cenaSkolarine());
        }


    }

}
