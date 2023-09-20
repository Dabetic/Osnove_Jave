package d19_09_2023;

import java.util.ArrayList;

public class Korpa {

    private ArrayList<Ambalaza> nizAmbalaza;

    public Korpa() {
        this.nizAmbalaza = new ArrayList<>();
    }

    public ArrayList<Ambalaza> getNizAmbalaza() {
        return nizAmbalaza;
    }

    public void dodjaAmbalazuUNiz(Ambalaza dodajAmb) {
        this.nizAmbalaza.add(dodajAmb);
    }

    public void izbaciAmbalazuIzNiza(String imeAmb) {
        for (int i = 0; i < this.nizAmbalaza.size(); i++) {
            if (this.nizAmbalaza.get(i).nazivArtikla.equals(imeAmb)) {
                this.nizAmbalaza.remove(i);
            }
        }
    }

    private double ukupnaCenaNizaSaPopustom(double popust) {

        double cenaKorpe = 0;
        for (int i = 0; i < this.nizAmbalaza.size(); i++) {
            cenaKorpe += this.nizAmbalaza.get(i).cenaArtikla();
        }
        return cenaKorpe - popust;
    }


    public double ukupnaCenaSaPopustomSuperKartice(SuperKartica superKartica) {
        return this.ukupnaCenaNizaSaPopustom(superKartica.getPopust());
    }
}
