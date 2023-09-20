package p19_09_2023;

import java.util.ArrayList;

//ime discipline
//tip discipline (Trkacka ili Skakacka)
//niz atletičara koji učestvuju u toj disciplini
public class Discipline {

    private String imeDiscipline;
    private String tipDispline;

    ArrayList<Atleticar>nizAtleticaraUDiciplini;

    public Discipline(String imeDiscipline, String tipDispline) {
        this.imeDiscipline = imeDiscipline;
        this.tipDispline = tipDispline;
        this.nizAtleticaraUDiciplini = new ArrayList<>();
//        this.najBoljiAtleticar();
    }

    public String getImeDiscipline() {
        return imeDiscipline;
    }

    public String getTipDispline() {
        return tipDispline;
    }

    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }

    public void setTipDispline(String tipDispline) {
        this.tipDispline = tipDispline;
    }

    public void dodajAtleticara (Atleticar dodajUnizDisciplina) {
        nizAtleticaraUDiciplini.add(dodajUnizDisciplina);
    }

    public void diskvalifikujAtleticara (String imeIPrezimeAtleticara) {
        for (int i = 0; i < this.nizAtleticaraUDiciplini.size(); i++) {
            if(this.nizAtleticaraUDiciplini.get(i).getImeIprezime().equals(imeIPrezimeAtleticara))
            this.nizAtleticaraUDiciplini.remove(i);
        }
    }

//    private Atleticar najBoljiAtleticar () {
//
//        for (int i = 0; i < this.nizAtleticaraUDiciplini.size(); i++) {
//            if(najBoljiAtleticar().kojiJeBolji(najBoljiAtleticar())) {
//                return nizAtleticaraUDiciplini.get(i);
//            }
//        }
//        return null;
//    }

}
