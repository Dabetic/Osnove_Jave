package p19_09_2023;

import java.util.ArrayList;

public class PoreskaUprava {

    private String imeGrada;
    private ArrayList<Objekat> nizObjekata;

    public PoreskaUprava(String imeGrada) {
        this.imeGrada = imeGrada;
        this.nizObjekata = new ArrayList<>();
    }

    public void dodajObjekat(Objekat objekat) {
        this.nizObjekata.add(objekat);
    }

    public double racuanjeUkupnogPoreza() {
        double sumaPoreza = 0;
        for (int i = 0; i < this.nizObjekata.size(); i++) {
            sumaPoreza = sumaPoreza + this.nizObjekata.get(i).racunanjePoreza();
        }
        return sumaPoreza;
    }

    public void stampanjeSvihObjekata() {
        for (int i = 0; i < this.nizObjekata.size(); i++) {
            this.nizObjekata.get(i).stampanje();
        }
    }

    public double maxPorez() {
        double maxPorez = 0;
        for (int i = 0; i < this.nizObjekata.size(); i++) {
            if(this.nizObjekata.get(i).racunanjePoreza() > maxPorez) {
                maxPorez = this.nizObjekata.get(i).racunanjePoreza();
            }
        }
        return maxPorez;
        }

    public double minPorez() {
        double minPorez = 500000;
        for (int i = 0; i < this.nizObjekata.size(); i++) {
            if(this.nizObjekata.get(i).racunanjePoreza() < minPorez) {
                minPorez = this.nizObjekata.get(i).racunanjePoreza();
            }
        }
        return minPorez;
    }


    }





