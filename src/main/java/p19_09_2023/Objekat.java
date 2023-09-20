package p19_09_2023;

//adresa (ulica i broj)
//povrsina objekta
//zona (1, 2 ili 3)
//konstuktore, gettere i settere
//metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
//zona 1, koeficijent je 1.4
//zona 2, koeficijent je 1.1
//zona 3, koeficijent je 1.05
//abstraktnu metodu koja racuna i vraca porez objekta
//abstraktnu metodu stampaj
public abstract class Objekat {

    protected String adressa;
    protected double povrsina;
    protected int zona;

    public Objekat(String adressa, double povrsina, int zona) {
        this.adressa = adressa;
        this.povrsina = povrsina;
        this.zona = zona;
    }

    public String getAdressa() {
        return adressa;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public int getZona() {
        return zona;
    }

    public void setAdressa(String adressa) {
        this.adressa = adressa;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public double racunanjeKoeficijenta () {

        if(zona == 1) {
            return 1.4;
        }
        if(zona == 2) {
            return 1.1;
        }
        if(zona == 3) {
            return 1.05;
        }

        return 0;
    }

    public abstract double racunanjePoreza();

    public abstract void stampanje();


}
