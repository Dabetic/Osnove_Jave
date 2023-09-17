package p14_09_2023;

//Kreirati klasu TestStep koja od privatnih atributa ima:
//opis
//actual vrednost
//expected vrednost
//errorMessage
//konstuktor koji postavlja sve atribute
//getere za sve elemente
//settere nemamo
//metodu validate koja proverava da li su actual i expected vrednosti jednake i ukoliko jesu metoda vraca true u suprotnom vraca false
//metodu za stampu koja stampa test step u formatu:
//|  Opis |
//| Status(failed ili passed) | Error message (ako je test step failovao)

public class TestStep {

    private String opis;
    private String stvarnaVrednost;
    private String ocekivanaVrednost;
    private String porukaOGresci;

    public TestStep(String opis, String stvarnaVrednost, String ocekivanaVrednost, String porukaOGresci) {
        this.opis = opis;
        this.stvarnaVrednost = stvarnaVrednost;
        this.ocekivanaVrednost = ocekivanaVrednost;
        this.porukaOGresci = porukaOGresci;
    }
    public String getOpis() {
        return opis;
    }

    public String getStvarnaVrednost() {
        return stvarnaVrednost;
    }

    public String getOcekivanaVrednost() {
        return ocekivanaVrednost;
    }

    public String getPorukaOGresci() {
        return porukaOGresci;
    }

    public boolean daLiSuStvarneIOcekivaneJednake () {
        if(stvarnaVrednost.equals(ocekivanaVrednost)) {
            return true;
        }
        return false;
    }

    public void stampanje () {
        System.out.println("Opis: " + opis);
        System.out.print("Status: ");
        if(daLiSuStvarneIOcekivaneJednake()==false) {
            System.out.println("FAILED | Poruka o gresci: " + porukaOGresci);
        } else {
            System.out.println("PASSED");
        }
    }
}
