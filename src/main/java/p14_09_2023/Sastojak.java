package p14_09_2023;

//Kreirati klasu Sastojak koja ima:
//        naziv
//        cenu
//        gettere i settere
//        konstruktore
//        metodu za stampanje koja stampa  podatke u formatu:
//        naziv - cena.din

public class Sastojak {

    private String sastojak;
    private int cena;

    public Sastojak (String sastojak, int cena) {
        this.sastojak = sastojak;
        this.cena = cena;
    }

    public String getSastojak() {
        return sastojak;
    }

    public int getCena() {
        return cena;
    }

    public void stampanje() {
        System.out.println("Sastojak: " + this.sastojak + " Cena: " + this.cena);
    }

}
