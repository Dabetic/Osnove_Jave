package p15_09_2023;

//Kreirati klasu Student koja nasledjuje klasu Osoba,
//koja od dodatnih atributa ima:
//broj indeksa
//dug za skolarinu
//konstuktor sa parametrima
//difoltni konstuktor
//metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//Napisati metod stampajStudenta da stampa sve podatke o studen
public class Student extends Osoba {

    private int brojIndeksa;
    private int rataZaSkolarinu;

    public Student() {

    }

    public Student(String imeIprezime, String jmbg, int brojIndeksa, int rataZaSkolarinu) {
        super(imeIprezime, jmbg);
        this.brojIndeksa = brojIndeksa;
        this.rataZaSkolarinu = rataZaSkolarinu;
    }

    public void metodaZaUmanjenjeSkolarine (int iznosZaUmanjenje) {

        this.rataZaSkolarinu -= iznosZaUmanjenje;
    }

    @Override
    public void stampanje () {

//        stampanje();
        System.out.println("Ime i prezime: " + this.imeIprezime);
        System.out.println("JMBG: " + this.jmbg);
        System.out.println("Broj indeksa: " + brojIndeksa);
        System.out.println("Dug za skolarinu: " + rataZaSkolarinu);

    }


}
