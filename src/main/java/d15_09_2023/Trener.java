package d15_09_2023;

////Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
////-godine iskustva
////-tip trenera (kondicioni, za igru, pomocni, personalni)
////-metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
////
////U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode a zatim kreirati niz igraca i niz trenera,
////na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.
public class Trener extends Osoba {

    private int godineIskustva;
    private String tipTrenera;


    public Trener(String ime,String prezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
        super(ime, prezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }


    public void stampanje () {
        super.stampanje();
        System.out.println("Godine iskustva: " + godineIskustva + " - Tip trenera: " + tipTrenera);
        System.out.println("*************");
    }
}
