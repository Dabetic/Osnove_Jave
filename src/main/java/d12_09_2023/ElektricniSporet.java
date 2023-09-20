package d12_09_2023;

//ElektricniSporet koja ima:
//●	marku storeta (npr: Beko, Bosh)
//●	garanciju kao broj godina
//●	maksimalan broj ukljucenih ringli u istom trenutku (1, 2, 3  ili 4)
//●	4 ringle
//○	gore levo
//○	gore desno
//○	dole levo
//○	dole desno
//●	konstruktor koji postavlja sve atribute
//●	gettere za sve atribut
//●	ne postoje setteri
//●	metodu pojacaj kojoj se prosledjuje pozicija ringle
//○	pozicija 1 je ringla gore levo
//○	pozicija 2 je ringla gore desno
//○	pozicija 3 je ringla dole levo
//○	pozicija 4 je ringla dole desno
//○	Ako se prelazi maksimalan broj ukljucenih ringli u jednom trenutku, pogasite sve ringle sem one koja se pojacava u tom pozivu funkije
//○	Za gasenje ringli iskoristite metodu koja je definisana ispod 👇
//●	metodu iskljuci ringlu kojoj se prosledjuje pozicija ringle
//○	pozicija 1 je ringla gore levo
//○	pozicija 2 je ringla gore desno
//○	pozicija 3 je ringla dole levo
//○	pozicija 4 je ringla dole desno
//●	metodu koja racuna i vraca ukupnu potrosnju za ceo elektricni sporet, tako sto sabira potrosnju za sve ringle (kao parametar se unosi vreme koliko vec ringle rade)
//●	metodu koja stampa podatke u formatu:
//marka - garancija u godinama
//Ringle:
//Gore levo:
//Ringla je ukljucena/iskljucena
//Tip ringle: tip ringle
//Jacina: jacina
//Grejac: jacina grejaca kW
//Gore desno:
//Ringla je ukljucena/iskljucena
//Tip ringle: tip ringle
//Jacina: jacina
//Grejac: jacina grejaca kW
//Dole levo:
//Ringla je ukljucena/iskljucena
//Tip ringle: tip ringle
//Jacina: jacina
//Grejac: jacina grejaca kW
//Dole desno:
//Ringla je ukljucena/iskljucena
//Tip ringle: tip ringle
//Jacina: jacina
//Grejac: jacina grejaca kW

public class ElektricniSporet {

    private String markaSporeta;
    private int garancija;
    private int maxBrojUkljucenihRingli;
    private Ringla ringlaGoreDesno;
    private Ringla rignlaDoleDesno;
    private Ringla ringlaGoreLevo;
    private Ringla ringlaDoleLevo;

    public ElektricniSporet(String markaSporeta, int garancija, int maxBrojUkljucenihRingli, Ringla ringlaGoreDesno, Ringla rignlaDoleDesno, Ringla ringlaGoreLevo, Ringla ringlaDoleLevo) {
        this.markaSporeta = markaSporeta;
        this.garancija = garancija;
        this.maxBrojUkljucenihRingli = maxBrojUkljucenihRingli;
        this.ringlaGoreDesno = ringlaGoreDesno;
        this.rignlaDoleDesno = rignlaDoleDesno;
        this.ringlaGoreLevo = ringlaGoreLevo;
        this.ringlaDoleLevo = ringlaDoleLevo;
    }

    public String getMarkaSporeta() {
        return markaSporeta;
    }

    public int getGarancija() {
        return garancija;
    }

    public int getMaxBrojUkljucenihRingli() {
        return maxBrojUkljucenihRingli;
    }

    public Ringla getRinglaGoreDesno() {
        return ringlaGoreDesno;
    }

    public Ringla getRignlaDoleDesno() {
        return rignlaDoleDesno;
    }

    public Ringla getRinglaGoreLevo() {
        return ringlaGoreLevo;
    }

    public Ringla getRinglaDoleLevo() {
        return ringlaDoleLevo;
    }

    public void ukljuciPozicijeRingli(int pozicija) {
        if (pozicija == 1) {
            this.ringlaGoreLevo.pojacajRignlu();
        }
        if (pozicija == 2) {
            this.ringlaGoreDesno.pojacajRignlu();
        }
        if (pozicija == 3) {
            this.ringlaDoleLevo.pojacajRignlu();
        }
        if (pozicija == 4) {
            this.rignlaDoleDesno.pojacajRignlu();
        }
    }

    public void iskljuciPozicijeRingli(int pozicija) {
        if (pozicija == 1) {
            this.ringlaGoreLevo.iskljuciRinglu();
        }
        if (pozicija == 2) {
            this.ringlaGoreDesno.iskljuciRinglu();
        }
        if (pozicija == 3) {
            this.ringlaDoleLevo.iskljuciRinglu();
        }
        if (pozicija == 4) {
            this.rignlaDoleDesno.iskljuciRinglu();

        }
    }

    public int ukupnaPotrosnja () {
        return 0;
    }
}
