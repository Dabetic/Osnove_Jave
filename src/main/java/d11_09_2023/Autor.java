package d11_09_2023;

//ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
public class Autor {

    private String ime;
    private String prezime;

    public Autor () {

    }

    public String getIme() {
        return this.ime = ime;
    }

    public void setIme (String ime ) {
        this.ime = ime ;
    }

    public String getPrezime () {
        return this.prezime = prezime;
    }

    public void setPrezime (String prezime) {
        this.prezime = prezime;
    }

    public void stampanje () {
        System.out.print(this.ime + " " + this.prezime);
    }


}
