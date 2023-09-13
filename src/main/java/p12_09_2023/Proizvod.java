package p12_09_2023;

//Naziv proizvoda
//kupca/musteriju
//cenu izrade proizvoda
//gettere i settere
//konstruktore
//Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//Metodu za stampanje proizvoda u formatu:
//naziv proizvoda - cena
//ime i prezime - broj kartice

public class Proizvod {

private String nazivProizvoda;
private Kupac kupac;
private int cenaIzradeProizvoda;

public Proizvod () {

}

public Proizvod (String nazivProizvoda, Kupac kupac, int cenaIzradeProizvoda) {
    this.nazivProizvoda = nazivProizvoda;
    this.kupac = kupac;
    this.cenaIzradeProizvoda = cenaIzradeProizvoda;
}

public String getNazivProizvoda (String nazivProizvoda) {
    return this.nazivProizvoda = nazivProizvoda;
}

public void setNazivProizvoda () {
    this.nazivProizvoda = nazivProizvoda;
}

public Kupac getKupac (Kupac kupac) {
    return this.kupac = kupac;
}

public void setKupac() {
    this.kupac = kupac;
}

public int getCenaIzradeProizvoda (int cenaIzradeProizvoda) {
    return this.cenaIzradeProizvoda;
}

public void setCenaIzradeProizvoda () {
    this.cenaIzradeProizvoda = cenaIzradeProizvoda;
}

public int racunanjePopusta () {
    return cenaIzradeProizvoda * 2 * (100 - kupac.getClanskaKarta().getPopust());
}
//cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
}
