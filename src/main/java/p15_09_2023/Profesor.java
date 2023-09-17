package p15_09_2023;

//Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//			koja od dodatnih atributa ima:
//naziv predmeta koji predaje
//iznos plate
//konstuktor sa parametrima
//difoltni konstuktor
//metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//Napisati metodu stampajProfu da stampa sve podatke o profesoru
//
//
//		U glavnom programu kreirati 2 studenta i 2 profesora.
public class Profesor extends Osoba {

    private String nazivPredmeta;
    int iznosPlate;

    public Profesor() {

    }
    public Profesor(String imeIprezime, String jmbg, String nazivPredmeta, int iznosPlate) {
        super(imeIprezime, jmbg);
        this.nazivPredmeta = nazivPredmeta;
        this.iznosPlate = iznosPlate;
    }

    public void povecajPlatu (int iznosZaPovecanje){

        this.iznosPlate = (iznosZaPovecanje * iznosPlate ) / 100;

    }
@Override
    public void stampanje () {
         super.stampanje();

        System.out.println("Naziv predmeta: " + nazivPredmeta);
        System.out.println("Iznos plate: " + iznosPlate);
    }

}
