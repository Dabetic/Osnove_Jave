package d19_09_2023;

import java.util.ArrayList;

public class PlaninarskiDom {

    private String nazivDoma;
    private int godinaOsnivanja;

    private ArrayList<Planinar>nizClanovaDoma;


    public PlaninarskiDom(String nazivDoma, int godinaOsnivanja) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnivanja = godinaOsnivanja;
        nizClanovaDoma = new ArrayList<>();
    }

    public String getNazivDoma() {
        return nazivDoma;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public ArrayList<Planinar> getNizClanovaDoma() {
        return nizClanovaDoma;
    }

  public void uclaniPlaninara (Planinar dodajPlaninaraUNiz) {
        nizClanovaDoma.add(dodajPlaninaraUNiz);
  }

  public void izbaciPlaninara (int idPlaninara) {
      for (int i = 0; i < nizClanovaDoma.size(); i++) {
          if(nizClanovaDoma.get(i).getidInt() == idPlaninara) {
              nizClanovaDoma.remove(i);
          }
      }
  }

  public void stampanjeDom () {
      System.out.println("Naziv doma" + this.nazivDoma);
      System.out.println("Godina osnivanja: " + this.godinaOsnivanja);

      System.out.println("Svi clanovi doma: ");
      for (int i = 0; i < nizClanovaDoma.size(); i++) {
          nizClanovaDoma.get(i).stampanje();
      }

  }

    public double mesecniPrihod () {
        double ukupno = 0;
        for (int i = 0; i < nizClanovaDoma.size(); i++) {
            ukupno += nizClanovaDoma.get(i).clanarinaPlaninara();
        }
        return ukupno;
    }

}
